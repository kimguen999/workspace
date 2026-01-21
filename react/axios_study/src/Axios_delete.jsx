import axios from 'axios';
import React, { useState } from 'react'

const Axios_delete = () => {
  // input 태그에 입력한 데이터를 저장할 state 변수
  const [empNum, setEmpNum] = useState('');
  console.log(empNum);

  const delEmp = ()=>{
    axios.delete(`http://localhost:8080/emps/${empNum}`)
    .then(res => {
      alert(res.data)
    })
    .catch(e=>console.log(e))
  }

  return (
    <>
      <h3>데이터 삭제</h3>    
      <p>삭제할 사원의 사번을 입력하시오</p>
      <input 
        type="text" 
        onChange={e=>setEmpNum(e.target.value)}
      />
      <button 
        type='button'
        onClick={e=>delEmp(e)}
      >삭제</button>
    </>
  )
}

export default Axios_delete