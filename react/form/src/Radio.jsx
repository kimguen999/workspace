

import React, { useState } from 'react'

const Radio = () => {
  // radio는 name 속성값이 같아야 세트로 판단
  
  // radio에서 선택한 데이터를 저장할 변수
  // radio에서 초기값은 최초로 선택된 라디오의 value값을 지정
  const [data, setData] = useState('y');
  console.log(data);
  return (
    <>
      <input 
        type="radio" 
        name='a' 
        value='y' 
        checked={data==='y'}
        onChange={e=>setData(e.target.value)}
      /> 예
      <input 
        type="radio" 
        name='a' 
        value='n'
        checked={data==='n'}
        onChange={e=>setData(e.target.value)}
      /> 아니오
    
    </>
  )
}

export default Radio