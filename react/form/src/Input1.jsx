
import React, { useState } from 'react'

const Input1 = () => {
  // value={}
  // input 태그의 초기값 && input 태그에 입력한 내용을 저장할 변수
  // value와 onChange는 세트다.
  const [data, setData] = useState('');
  console.log(data);
  return (
    <>
      <div>
        {/* input 태그에 값이 변할때 마다 data에 저장 */}
        <input 
          className='oiu'
          id = 'abc'
          type="text" 
          value={data} 
          // 매개변수e (아무거나 넣어도됨) : 이벤트에 대한 모든 정보가 들어가있음
          onChange={e=>{
            // e.target : 이벤트가 발생한 태그
            console.log(e.target);

            // console.log(e.target.id);
            // console.log(e.target.type);
            // console.log(e.target.className);
            // console.log(e.target.value);
            
            
            setData(e.target.value);
          }}
        />
      </div>
    
    
    
    
    </>
  )
}

export default Input1