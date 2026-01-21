import axios from 'axios';
import React, { useState } from 'react'

const Axios_post = () => {

  // 입력정보 state 변수
  // useState() 괄호안에는 postman 객체형식을 넣는다고 생각
  const [data,setData] = useState({
    empNum : '',
    empName : '',
    empPart : '',
    empRank : '',
    empSalary : ''
  });

  const handleEmp = e=>{
    setData({
      ...data,
      [e.target.name]:e.target.value
    })
  }

  console.log(data);
 
  // 등록버튼 클릭 시 spring으로 요청을 보내는 함수
  // POST 함수의 두번째 매개변수는 spring으로 전달할 데이터이다
  // 전달 데이터는 무조건 객체형태{}로 보내야한다.
  const regEmp = ()=>{
    axios.post('http://localhost:8080/emps', data)
    .then(res => {
      console.log('통신성공')
      alert('통신성공')
    })
    .catch(e => console.log(e))
  }


  return (
    <>
      <h3>(POST) 입력데이터 spring으로 전달하기</h3>
      <div>
        사번 : 
        <input 
          type="text" 
          name='empNum'
          value={data.empNum}
          onChange={e=>handleEmp(e)}
        />
      </div>
      <div>
        사원명 : 
        <input 
          type="text" 
          name='empName'
          value={data.empName}
          onChange={e=>handleEmp(e)}
        />
      </div>
      <div>
        부서 : 
        <input 
          type="text" 
          name='empPart'
          value={data.empPart}
          onChange={e=>handleEmp(e)}
        />
      </div>
      <div>
        직급 : 
        <input 
          type="text" 
          name='empRank'
          value={data.empRank}
          onChange={e=>handleEmp(e)}
        />
      </div>
      <div>
        급여 : 
        <input 
          type="text" 
          name='empSalary'
          value={data.empSalary}
          onChange={e=>handleEmp(e)}
        />
      </div>
      <div>
        <button 
          type='button'          
          onClick={e=>regEmp(e)}
        >
        등록
        </button>
      </div>
    

      <div>
        <p>저장 되었는지 확인</p>
        <p>사번 : {data.empNum}</p>
        <p>사원명 : {data.empName}</p>
        <p>부서 : {data.empPart}</p>
        <p>직급 : {data.empRank}</p>
        <p>급여 : {data.empSalary}</p>
      </div>
    </>
  )
}

export default Axios_post