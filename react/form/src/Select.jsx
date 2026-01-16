
import React, { useState } from 'react'

const Select = () => {
  
  // select 태그에서 선택한 데이터를 저장할 state변수
  // 초기값은 화면에 표현한 value값을 지정하는거
  // setlect의 value 속성값과 일치하는 option 태그의 value를 가진 태그가 화면에 보임
  const [data, setData] = useState('3'); 
  console.log(data);

  return (
    <>
      <div>
        <select value={data} onChange={e=>setData(e.target.value)}>
          <option value='5'>자바</option>
          {/* setect는 눈에 보이는 글자를 저장하는게 아니라
              선택한 option 태그의 value값을 저장한다 */}
          
          <option value='9'>파이썬</option>
          <option value='3'>자바스크립트</option>
          <option value='4'>리액트</option>
        </select>
      </div>
    
    
    </>
  )
}

export default Select