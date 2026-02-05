import React, { useState } from 'react'

const UseState1 = () => {

  const [cnt, setCnt] = useState(0);
  // state 변경함수 코드가 해석되면
  // state 변경함수의 실행은 나머지 코드 실행 완료 후 일괄 실행됨(동시 실행)
  // ex) onClick 눌러도 onClick 안에있는거 다 하고(그동안 변경은 보류) 실행
  // state 변경함수가 여러개 실행되도 1회만 리렌더링함

  const [cnt2, setCnt2] = useState(0);
  // state 변경함수 사용법은 두가지가 존재
  // 1. setCnt(cnt변수에 저장할 값);
  //    ex) setCnt(7); -> cnt값을 7로 변경

  // 2. 함수형 업데이트
  //    setCnt((이전 cnt값)=>{return cnt 변수에 저장할 값});
  //    ex) setCnt((prev)=>{return 7})   
  //        return 있을땐 중괄호만 생략 불가. return 키워드도 생략하기
  //        ->   setCnt(prev=>7)
  //    ex) setCnt(prev=>prev+5);  이전값 + 5


  return (
    <>
      <h3>{cnt} cnt</h3>
      <button 
        type='button'
        onClick={(e)=>{
          console.log(cnt)
          setCnt(cnt+5);
          console.log(cnt)
          setCnt(cnt+1);
          console.log(cnt)
          // state 변경함수는 할꺼 다 하고 리렌더링함
          // 콘솔 출력 다하고 cnt 1증가
          // state 동시에 실행하므로 마지막 state만 해석 -> 1번만 리렌더링
          
        }}
      >클릭</button>
      <h3>{cnt2} cnt2</h3>
      <button 
        type='button'
        onClick={()=>{
          console.log(cnt2)
          setCnt2(prev=>prev+5);
          console.log(cnt2)
          setCnt2(prev=>prev+1);
          console.log(cnt2)
          // 함수형 업데이트를 사용하면 state 변경함수를 원하는 만큼 사용 가능
        }}
      >클릭</button>
    
    </>
  )
}

export default UseState1