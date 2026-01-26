import React, { useState } from 'react'
import Test6_Title from './Test6_Title'
import Test6_Display from './Test6_Display'
import Test6_Controller from './Test6_Controller'

const Test6 = () => {

  // 현재 숫자를 저장할 state 변수
  const [cnt, setCnt] = useState(0);

  // state 변경 함수가 실행되면
  // state 변수가 선언된 컴포넌트가 리렌더링된다.
  
  console.log('Test6 컴포넌트가 실행됩니다')

  return (
    <>
      <Test6_Title/>
      <Test6_Display cnt={cnt}/>
      <Test6_Controller cnt={cnt} setCnt={setCnt}/>
      {/* 함수를 전달할 때는 소괄호 없이 */}
    </>
  )
}

export default Test6