

import React, { useState } from 'react'
import './Test4_UseState.css'


const Test4_UseState = () => {

  // 스프레드 연산자
  // -> 배열, 객체에 저장된 데이터 각각을 흩뿌린다는 느낌
  const array1 = [4,5]; // 데이터 1개 (배열1개)
  const array2 = [1,2,array1];  // 데이터의 갯수 : 3개 (정수2개+배열1개)
  const array3 = [1,2,...array1];  // 스프레드 연산자, 데이터의 갯수 : 4개 (정수4개)
  //
  //
 
  
  const [arr, setArr] = useState([0,0,0]);
  
  const [a1,a2] = useState(0);
  const [b1,b2] = useState(0);
  const [c1,c2] = useState(0);

  // 클릭시 1씩 늘어나는 함수 (함수로 쓰면 여려개 수정 편함)
  const changeNum = (i)=>{
    const copyArr = [...arr]; 
          copyArr[i] = copyArr[i]+1;
          setArr(copyArr);
  };


  return (
    <>



      <div className='test4_container2'>
        {/* 배열, 객체 : 자바스크립트에서는 참조자료형 */}
        <div onClick={()=>{
          // const copyArr = arr;   데이터 1개(배열1개)
          const copyArr = [...arr];  
          // ...arr : 데이터 3개(0 3개)  [...arr] : 배열로 감쌌으므로 데이터 1개
          copyArr[0] = copyArr[0]+1;
          setArr(copyArr)
        }}>{arr[0]}</div>

        <div onClick={()=>{
          changeNum(1);       // 클릭시 1씩 늘어나는 함수
        }}>{arr[1]}</div>

        {/* 중괄호 생략 */}
        <div onClick={()=>changeNum(2)}>{arr[2]}</div>    
        
        <div onClick={()=>{
        }}>합 : {arr[0]+arr[1]+arr[2]}</div>
      </div>

    
      <div className='test4_container'>
        <div onClick={()=>a2(a1+1)}>{a1}</div>  
        {/* 함수 1줄이라 중괄호 생략 가능, 매개변수는 없기때문에 생략 불가 */}
        <div onClick={()=>b2(b1+1)}>{b1}</div>
        <div onClick={()=>c2(c1+1)}>{c1}</div>
        <div onClick={()=>{
          a2(a1+1);
          b2(b1+1);
          c2(c1+1);
        }}>합 : {a1+b1+c1}</div>
      </div>
    </>
  )
}

export default Test4_UseState