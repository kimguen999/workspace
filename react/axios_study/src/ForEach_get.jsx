import axios from 'axios'
import React, { useEffect, useState } from 'react'

const ForEach_get = () => {

  // spring에서 사원 목록 정보 조회한 정보 저장
  // 조회한 데이터를 담을 변수의 초기값은 최종적으로 저장될 데이터의 형태(자료형)와 같아야한다
  const [empListInfo,setEmpListInfo] = useState([]);
  // 스프링에서 가져올 `http://localhost:8080/emps`의 자료형이 배일이기 때문에 empListInfo도 배열이므로 useState의 자료형도 배열로한다.

  console.log(empListInfo)

  // 마운트 시점에 사원목록 조회
  useEffect(()=>{
    axios.get(`http://localhost:8080/emps`)
    .then(res=>{
      console.log('통신성공');
      console.log(res.data);
      setEmpListInfo(res.data);
    })
    .catch(e=>console.log(e))
  },[])
  
  return (
    <>
      <table border={1}>
        <thead>
          <tr>
            <td>사번</td>
            <td>사원명</td>
            <td>부서</td>
            <td>직급</td>
            <td>급여</td>
          </tr>
        </thead>
        <tbody>
          {
            empListInfo.map((e,i)=>{
              return (
                <tr key={i}>
                  <td>{e.empNum}</td>
                  <td>{e.empName}</td>
                  <td>{e.empPart}</td>
                  <td>{e.empRank}</td>
                  <td>{e.empSalary}</td>
                </tr>
              )
            })
          }
        </tbody>
      </table>

    </>
  )
}

export default ForEach_get