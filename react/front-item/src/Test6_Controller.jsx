import React, { useState } from 'react'

const Test6_Controller = ({cnt, setCnt}) => {
  // 구조분해할당
  // props 대신 props에 들어가는 객체를 적으면 됨

  // console.log(props)  -> {setCnt : setCnt(), cnt : 0}
  
  console.log('Controller 컴포넌트가 실행됩니다')

  return (
    <>
      <div style={{
        backgroundColor:'lightgray',
        padding : '12px',
        margin : '12px 0px'
      }}>
        <button 
          type='button'
          onClick={()=>setCnt(cnt-10)}
          // 구조분해할당으로 인해 props.cnt 대신 cnt 사용
        >-10</button>
        <button 
          type='button'
          onClick={()=>setCnt(cnt-1)}
        >-1</button>
        <button 
          type='button'
          onClick={()=>setCnt(cnt+1)}
        >+1</button>
        <button 
          type='button'
          onClick={()=>setCnt(cnt+10)}
        >+10</button>
        
      </div>
    
    </>
  )
}

export default Test6_Controller