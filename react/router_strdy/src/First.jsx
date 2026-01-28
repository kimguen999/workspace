import React from 'react'
import { useParams } from 'react-router-dom'

const First = () => {

// URL Parameter로 전댈되는 데이터 받기
// const params = useParams();
const {age} = useParams();  // {age:2} 객체
// console.log(params);

  return (
    <>
      <h3>First 컴포넌트</h3>
      <p>/first url을 입력하면 컴포넌트가 보입니다.</p>
      <p>{age}</p>
    </>
  )
}

export default First