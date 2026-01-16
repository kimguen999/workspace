
import React, { useState } from 'react'

const Input3 = () => {

  const phone = {
    modelName : 's20',
    price : 10000
  };
  phone.modelName;
  phone['modelName']
  // 키값에 접근하는 문법은 2개이다.

  let key = 'modelName';
  phone.key;
  // phone.modelName;  --> 안됨
  phone['key']
  phone['modelName']



/////////////////////////////////////////////
  const [data, setData] = useState({
    id : '',
    pw : '',
    name : ''
  });
  console.log(data);

  // data 변수 변경 함수
  const handleData = (e)=>{
    setData({
      ...data,
      [e.target.name] : e.target.value
      // 변수라서 대괄호 씌어줌
    });
  };


  return (
    <>
      <div>
        아이디 
        <input 
          type="text" 
          name='id' 
          value={data.id} 
          onChange={e=>handleData(e)}
        />
            <br />
        비밀번호
        <input 
          type="password" 
          name='pw'
          value={data.pw} 
          onChange={e=>handleData(e)}
        />
        <br />
        이름 
        <input 
          type="text" 
          name='name'
          value={data.name} 
          onChange={e=>handleData(e)}
        />
      </div>  
    
    
    
    </>
  )
}

export default Input3