
// 실습 2> 클릭할 때마다 ON/OFF 로 바뀌는 버튼과 글자
import React, { useState } from 'react'

const Test2_UseState = () => {

  const [dis, setDis] = useState('ON');
  const [btn, setBtn] = useState('OFF');
    

  return (


    <>
      <div>{dis}</div>
      <button type='button'onClick={()=>{
        setDis(dis==='ON' ? 'OFF' : 'ON');
        setBtn(btn==='ON' ? 'OFF' : 'ON');
      }}>{btn}</button>




    </>
  )
}

export default Test2_UseState