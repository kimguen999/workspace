import axios from 'axios';
import React, { useState } from 'react'

const Axios4 = () => {

  // select 선택한 사번 저장
  const [empNum,setEmpNum] = useState('');

  // 조회 사원 정보 저장
  const [empInfo, setEmpInfo] = useState({});

  console.log(empNum);

  const fun = (a) => {
    axios.get(`http://localhost:8080/emps/${a}`)
    .then(re=>{
      console.log('통신성공')
      console.log(re.data);
      setEmpInfo(re.data)
    })
    .catch(e=>console.log(e))
  }

  return (
    <>
      <h3>조회할 사번 선택</h3>
      <select 
        value={empNum}
        onChange={e=>{
          setEmpNum(e.target.value);
          fun(e.target.value);
        }}
        
      >
          <option value=''>사번선택</option>
          <option value='101'>101</option>  
          <option value='102'>102</option>  
          <option value='103'>103</option>  
          <option value='104'>104</option>  
          <option value='105'>105</option>  
        
      </select>
      <div>
        <h4>조회한 사원 정보입니다</h4>
        <p>사번 : {empInfo.empNum}</p>
        <p>사원명 : {empInfo.empName}</p>
        <p>직급 : {empInfo.empRank}</p>
        <p>급여 : {empInfo.empSalary}</p>
        <p>부서명 : {empInfo.empPart}</p>
      </div>
    </>
  )
}

export default Axios4