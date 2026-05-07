

const cal = ()=>{
  // 두 input 태그에 입력한 값을 읽어온다
  // -> input 태그의 value 속성값을 읽어온다
  //  1) input 태그에 접근
  const num1_tag = document.querySelector('#num1');
  //  2) 접근한 태그에서 value 속성값 읽기
  console.log(num1_tag.value);

  const num1 = num1_tag.value;
  const num2 = document.querySelector('#num2').value;


  // 가져온 값을 더한다 
  // input 태그 안에 값은 문자열로 인식하기 때문에 number 써야함.
  const result = Number(num1) + Number(num2);


  // 더한 값을 결과 input 태그에 넣어준다
  const result_tag = document.querySelector('#result');
  result_tag.value = result;

}

// 리액트와 달리 그림을 아랑서 그려주지 않음. 노가다 해야함
const addRow = ()=>{
  // tbody 태그에 접근
  const tbody_tag = document.querySelector('#table > tbody');

  // const str = '<tr><td>1</td><td>2</td><td>3</td></tr>'

  const str = `
    <tr>
      <td>1</td>
      <td>2</td>
      <td>3</td>
    </tr>
  `
  tbody_tag.insertAdjacentHTML('beforeend',str)

}