
import React from 'react'

const Event2 = () => {
  let title = 'hello react~';

  // 구조분해할당 : 배열, 객체에 저장된 다수의 데이터 각각을 편하게 사용하는 방법
  // 구조분해할상 사용 x
  const arr = [1, 23.3, 'hello'];
  const a = arr[0];
  const b = arr[1];
  const c = arr[2];
  
  // 구조분해할당
  const arr1 = [1, 23.3, 'hello'];
  const [a1, b1, c1] = arr1;  // 구조분해할당 (배열아니다)
  console.log(a1); // 1
  console.log(c1); // 'hello'
  
  const arr2 = [1, 23.3, 'hello'];
  const [a2, b2] = arr2;
  console.log(a2); // 1
  console.log(b2); // 23.3
  // 'hello'는 없어지는게 아니라 저장만 안되어있을뿐.
  
  const [a3, b3, c3, d3] = arr2;
  console.log(a3); // 1
  console.log(b3); // 23.3
  console.log(c3); // 'hello'
  console.log(d3); // undefined - 변수가 선언은 되어있는데 초기값이 없기때문

  // 자바스크립트는 함수도 하나의 자료형으로 취급
  // ㄴ> 함수가 변수에 들어갈 수 있다.
  // ㄴ> 함수표현식은 이개념에 의해서 만들어짐
  // const abc = function(){ console.log(1234); }
  //         ㄴ--<-<-|----<----<-|--------<-|

  const array = [
    5,
    'script',
    () => {console.log('함수실행');}
  ]

  const [aa, bb, cc] = array;
  console.log(aa); // 5
  console.log(bb); // 'script'
  console.log(cc); // ???




  return (
    <>
      <div>Event2</div>
      <h3>{title}</h3>
      <button type='button' onClick={()=>{
        // title 변수의 값 변경
        title = "Welcome";
        // 값은 바뀌지만 화면은 안바뀐다
        console.log(title);
      }}>제목변경</button>
    </>
  )
  
}

export default Event2