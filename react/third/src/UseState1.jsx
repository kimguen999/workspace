

import React, { useState } from 'react'

// useState는 2개의 데이터를 갖는 배열이다
// 0번째 요소 : 매개변수로 전달한 데이터
// 1번째 요소 : 함수
// 1번째 요소인 함수는 변수의 값을 변경하는 기능
const UseState1 = () => {

  useState(5);
  console.log(useState(5));   //2) [5, ƒ]   2칸짜리 배열, f는 함수
  console.log(useState([1,2,3]));    //2) [Array(3), ƒ]    2칸짜리 배열, f는 함수
  //const a = useState(5)[0];  //5
  //const b = useState(5)[1];  //f
  const [a,b] = useState(5);
  console.log(a); // 5
  // console.log(b); // b는 함수라서 이렇게 쓰면 안된다.
  // b();
  const [title, setTitle] = useState('hello react~');

  return (
    <>
      <div>UseState1</div>
      <h2>{a}</h2>
      <button type='button' onClick={()=>{
        b(10);  // a변수의 값을 10으로 변경하는 코드
      }}>클릭</button>;
   {/*    * 일반변수로 바꾸면 화면에 반영이 안되지만
            useState로 바꾸면 화면에 반영이 된다. */}

     
      <h2>{title}</h2>
      <button type='button' onClick={()=>{
      setTitle("응 바꼈어");  // a변수의 값을 10으로 변경하는 코드
      }}>클릭</button>
        
        
        {/* 결론
          데이터의 값 변경이 화면에 변경되려면
          해당 데이터는 반드시 useState로 선언!! */}
        {/* useState를 사용해 만들어진 변수(title)를 'state 변수'
            useState를 사용해 만들어진 함수(setTitle)를 'state 변경 함수 */}
        {/* state 변경함수가 실행되면 컴포넌트를 리렌더링한다.
            리렌더링 : 컴포넌트의 처음부터 끝까지 다시 실행하는 것 */}
        {/* state 변수는 리렌더링 되더라도 초기화되지 않는다 */}



    </>
  )
}

export default UseState1