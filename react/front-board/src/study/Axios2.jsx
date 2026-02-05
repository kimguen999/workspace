import axios from 'axios'
import React, { useState } from 'react'

const Axios2 = () => {
  // 조회한 학생 정보를 저장할 state 변수
  const [stuInfo, setStuInfo] = useState({});


  // 학생의 상세 정보 조회 및 점수 조회
  const getData =()=>{
    // 학번이 1001번인 학생의 정보를 조회
    axios.get(`http://localhost:8080/students/1001`)
    .then(response =>{
      setStuInfo(response.data); 
      // ㄴ> 이 코드가 반드시 실행되어야만 stuInfo.gradeNum axios가 실행가능함
      // 하지만 axios가 비동기 방식이라서 stuInfo.gradeNum은 undefined나옴
      // .then 안에 성적조회 axios를 넣으면 순서는 맞을 것 같지만, state함수로 적용되어 성적 정보 조회 후 상세조회를 하는 순서가 뒤바뀐 응답을 해버림.
    })
    .catch();

    // 조회한 학생의 성적 정보 조회
    axios.get(`http://localhost:8080/grades/${stuInfo.gradeNum}`)
    .then()
    .catch();

  }

  return (
    <>
    
    
    
    </>
  )
}

export default Axios2