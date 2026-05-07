const getStuList = ()=>{
  const select_tag = document.querySelector('#classSelector')
  const classNum = select_tag.value;
  // ? 뒤는 url이 아니다.
  // /stu/main으로 가야함
  location.href=`/stu/main?classNum=${classNum}`;
}

// 동기 : 
//    다음코드는 이전 코드가 실행 완료 후 진행
//    화면과 데이터가 동시에 적용된다
// 비동기 :
//    다음코드가 이전 코드가 실행되자마자 실행
//    화면과 데이터가 따로 논다

const asyncGetList = ()=>{
  const select_tag = document.querySelector('#classSelector')
  const classNum = select_tag.value
  axios.get(`/stu/list?classNum=${classNum}`)
  .then(response => {
    console.log(response.data);

    // 조회한 데이터로 그림을 다시 그린다
    // 1. 그림을 다시 그릴 태그를 선택
    const tbody_tag = document.querySelector("#list-table > tbody");

    // 2. 기존 tbody 안의 모든 태그를 지운다(초기화)
    tbody_tag.innerHTML = '';

    // 3. 새롭게 그릴 그림을 문자열로 만든다
    let str = ``;
    for(let i = 0; i<response.data.length; i++){
      str +=`
        <tr>
          <td>${response.data.length - i}</td>
          <td>${response.data[i].stuNum}</td>
          <td>
            <a href="/stu/score?stuNum=${response.data[i].stuNum}">
              ${response.data[i].stuName}
            </a>
          </td>
          <td>${response.data[i].stuYear}</td>
          <td>${response.data[i].classNum}</td>
          <td>${response.data[i].classDTO.className}</td>
        </tr>
      `;
    }

    // foreach방식
    // response.data.foreach((stu, i)=>{
    //   str +=`
    //     <tr>
    //       <td>${response.data.length - i}</td>
    //       <td>${stu.stuNum}</td>
    //       <td>${stu.stuName}</td>
    //       <td>${stu.stuYear}</td>
    //       <td>${stu.classNum}</td>
    //       <td>${stu.classDTO.className}</td>
    //     </tr>
    //   `;
    // })


    // 4. 새롭게 만든 그림을 tbody에 넣는다.
    tbody_tag.insertAdjacentHTML("beforeend",str)

  })
  .catch(e=>console.log(e))
}