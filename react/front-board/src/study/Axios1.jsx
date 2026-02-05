import axios from 'axios'
import React from 'react'

const Axios1 = () => {

  // axios는 비동기 방식으로 동작한다
  // 비동기 방식 : 코드 실행 시 결과를 기다리지 않고 다음 코드를 실행한다
  // 1. console.log(1) 실행 + 완료 후 axios 실행  -> 1출력
  // 2. axios 실행하는 동안 비동기 방식이므로 데이터를 가져오는 동안
  //  console.log(3), console.log(num)을 실행해버림
  //  3출력, undefined출력  (num=5를 해석하기 전에 num을 출력해버려서)
  // 3. axios 실행 완료되는대로 console.log(2)출력

  const getData = ()=>{
    console.log(1)
    let num;
    // 3번 게시글에 달린 댓글 목록 조회
    axios.get(`http://localhost:8080/replies/3`)
    .then(response=>{
      console.log(2);
      num = 5
    })
    .catch(e=>console.log(e));
    console.log(3);
    console.log(num);
  }

  return (
    <>
      <div>
        <button 
          type='button'
          onClick={(e)=>{getData(e)}}
        >데이터조회</button>
      </div>
    
    
    </>
  )
}

export default Axios1