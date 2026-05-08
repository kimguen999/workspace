const asyncGetList = () => {
    const select_tag = document.querySelector('#classSelector')
    const classNum = select_tag.value
    axios.get(`/stu/list?classNum=${classNum}`)
    .then(response => {
        const tbody_tag = document.querySelector("#list-table > tbody");
        tbody_tag.innerHTML = '';

        for(let i = 0; i < response.data.length; i++){
            const stu = response.data[i];
            const className = stu.classDTO ? stu.classDTO.className : '';
            tbody_tag.insertAdjacentHTML("beforeend", `
                <tr>
                    <td>${response.data.length - i}</td>
                    <td>${stu.stuNum}</td>
                    <td>
                        <div onclick="getScoreInfo(${stu.stuNum})" style="cursor:pointer; color:blue;">
                            ${stu.stuName}
                        </div>
                    </td>
                    <td>${stu.stuYear}</td>
                    <td>${stu.classNum}</td>
                    <td>${className}</td>
                </tr>
            `);
        }
    })
    .catch(e => console.log(e))
}


const saveScore = (stuNum) => {
  const data = {
    stuNum  : stuNum,
    korScore : Number(document.querySelector('#korean').value),
    engScore : Number(document.querySelector('#english').value),
    mathScore : Number(document.querySelector('#math').value),
  }

  axios.post('/stu/score-save', data)  
  .then(response => alert('점수 저장 완료'))
  .catch(e => console.log(e))
    
}




// 그릴 함수
const drawScore = (scoreInfo)=>{
    const score_div = document.querySelector('#score-div');  

    // 선택한 태그 안의 모든 내용 삭제
    score_div.innerHTML = '';

    const korean  = scoreInfo.korScore  ?? 0;
    const english = scoreInfo.engScore  ?? 0;
    const math    = scoreInfo.mathScore ?? 0;
    const total   = korean + english + math;
    const avg     = total === 0 ? 0 : (total / 3).toFixed(1);
    const stuName = scoreInfo.stuDTO ? scoreInfo.stuDTO.stuName : '';
    const stuNum  = scoreInfo.stuDTO ? scoreInfo.stuDTO.stuNum  : 0;
    console.log("stuNum : ", stuNum)
    console.log("korean : ",korean)

    score_div.insertAdjacentHTML("afterbegin", `
        <table border="1">
            <thead>
              <tr>
                <td>학생명</td>
                <td>국어점수</td>
                <td>영어점수</td>
                <td>수학점수</td>
                <td>총점</td>
                <td>평균</td>
              </tr>
            </thead>
            <tbody>
              <tr>
                <td>
                  ${scoreInfo.stuDTO.stuName}
                </td>
                <td>
                  <input 
                    type="number" 
                    id="korean"  
                    class="score-input"
                    value="${scoreInfo.korScore}"
                  >
                </td>
                <td>
                  <input 
                    type="number" 
                    id="english" 
                    class="score-input"
                    value="${scoreInfo.engScore}"
                  >
                </td>
                <td>
                  <input 
                    type="number" 
                    id="math"    
                    class="score-input"
                    value="${scoreInfo.mathScore}"
                  >
                </td>
                <td 
                  id="total"
                  class="score-input"
                >${total}</td>
                <td 
                  id="avg"
                  class="score-input"
                >${avg}</td>
              </tr>
            </tbody>
        </table>
        <button type="button" onclick="saveScore(${scoreInfo.stuNum})">수정</button>
    `);
}




const getScoreInfo = (scoreInfo) => {
    axios.get(`/stu/score?stuNum=${scoreInfo}`)
    .then(response => {
        console.log(response.data);
        drawScore(response.data);
    })
    .catch(e => console.log(e))
}




