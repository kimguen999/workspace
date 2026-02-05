import axios from 'axios'
import React from 'react'

const Axios3 = () => {

  // axios의 또다른 사용방법
  const getData1 = async()=>{

    // axios 사용방법 1
    axios.get('url')
    .then(response=>{
      console.log(response.data)
    })
    .catch()

    // axios 사용방법 2
    // axios를 비동기에서 동기방식으로 실행 동작을 변경할수 있음
    // await, async 키워드를 사용하면 가능
    // await 키워드는 axios 명령어 앞에 붙임.
    // async 키워드는 axios 코드가 포함된 함수의 정의문 앞에 붙임
    // 이 방식을 쓰면 await가 붙은 axios는 동기방식으로 실행.
    // 단, async가 붙어버린 함수 자체는 비동기가 된다.
    try{
      const response = await axios.get('http://localhost:8080/boards');
      //post();, delete();, put(); 가능
      console.log(response.data);  // try에 await 넣지 않는다면 undefined뜸, axios값이 조회되기도 전에 response로 결과를 넣기 때문
    } catch (e) {
      console.log(e)
    }
  }


    // Axios2 컴포넌트에 적은 예제 실습

    const getData = async()=>{
      try{
        const response = await axios.get(`http://localhost:8080/students/1001`)
        axios.get(`http://localhost:8080/grades/${response.data.gradeNum}`)
        console.log(response.data);
        console.log(2)
      } catch (e) {
        console.log(e)
      }
    }

    // abc 함수 실행 결과 출력은 1, 3, 2 순으로 출력된다
    const abc = ()=>{
      console.log(1);
      getData();  
      // await를 써서 axios 자체는 동기로 변하지만
      // async가 비동기가 되어버려 조회하는 동안 3을 먼저 출력해버린다.
      console.log(3);
    }



  return (
    <>
    
    
    
    </>
  )
}

export default Axios3