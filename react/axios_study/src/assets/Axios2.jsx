import axios from 'axios'
import React, { useEffect, useState } from 'react'

const Axios2 = () => {

  const [emp,setEmp] = useState({});
  // '' 대신 null을 사용한다면 오류발생
  // emp를 객체로 보지 않기 때문
  // ''를 사용한다면 emp를 비어있지만 객체로는 보기 때문에 오류안뜸
  console.log(emp.empName);
  // useState(null) 일때 console.log(emp.Name); => 오류(객체인식X)
  // useState('') 일때 console.log(emp.Name); => 오류X, undifined뜸(객체인식하지만 Name을 찾지 못해서 undifined)


  // spring에서 리턴받은 데이터를 저장하기 위해 state변수의 초기값은
  // 최종 데이터 자료형을 따라간다.  ==> useState({}) (객체일경우)
  // ex) useState([]) (배열일경우), useState('') (문자열일경우), useState(0) (숫자일경우)



  // 마운트될때만 실행
  // useEffect 없다면 setEmp(response.data)때문에 무한 리렌더링함
  useEffect(()=>{
    axios.get('http://localhost:8080/emps/101')
    .then(response=>{
      console.log('통신성공');
      console.log(response.data);
      setEmp(response.data);
    })
    .catch(error=>{
      console.log('통신실패');
    })
  },[])

  

  return (
    <>
       
        <div>
          <h2>사원정보</h2>
          <p>사번 : {emp.empNum}</p>
          <p>사원 : {emp.empName}</p>
          <p>부서 : {emp.empPart}</p>
          <p>급여 : {emp.empSalary}</p>
          <p>직급 : {emp.empRank}</p>
          
            {/* useState(null)로 코드 작성하고 싶다면 
                {emp && emp.empNum} 이런 식으로 작성하면됨
                단락평가 사용
                null이므로 falsy취급이라 emp.empNum 해석 안하고
                바로 useEffect로 넘어가는데 setEmp로인해 값이 들어가고
                truthy 취급이라 emp.empNum 해석을 해서 값이 나옴*/}

        </div>
      
    </>
  )
}

export default Axios2