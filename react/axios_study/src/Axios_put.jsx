import axios from 'axios';
import React, { useState } from 'react'

const Axios_put = () => {
  // 입력 정보 저장 변수
  const [data, setData] = useState({
    empNum : '',
    // select는 보여주고싶은 value값을 초기값으로준다.
    empPart : '영업부',
    empSalary : ''
  });

  const handleEmp = e=>{
    setData({
      ...data,
      [e.target.name] : e.target.value
    })
  }
 
  console.log(data);

  const putEmp = ()=>{
    axios.put(`http://localhost:8080/emps/${data.empNum}`, data)
    .then(res=>{
      alert('통신성공')
      console.log('통신성공')
    })
    .catch(e=>{
      console.log(e);
      console.log('통신실패')
    })
  }

  return (
    <>
      <h3>사원 정보 수정</h3>
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
        수정할 부서 : 
        <select 
          name="empPart"
          value={data.empPart} 
          onChange={e=>handleEmp(e)}
        >
          <option value="영업부">영업부</option>
          <option value="관리부">관리부</option>
          <option value="운영부">운영부</option>
          <option value="개발부">개발부</option>
        </select>
      </div>
      <div>
        수정할 급여 : 
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
          onClick={e=>putEmp()}
        >수정</button>
      </div>
    </>
  )
}

export default Axios_put