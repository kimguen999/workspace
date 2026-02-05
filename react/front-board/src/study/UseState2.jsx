import React, { useState } from 'react'

const UseState2 = () => {

// 객체의 함수형 업데이트 사용방법
  const [member, setMember] = useState({
    name : 'kim'
    , age : 30
    , addr : '서울'
  });

  return (
    <>
      <div>
        이름 : {member.name} <br />
        나이 : {member.age} <br />
        주소 : {member.addr}
      </div>
      <button 
        type='button'
        onClick={()=>{
          setMember({
            ...member
            , name : 'lee'
          })
          setMember({
            ...member
            , age : 20
          })
        }}
        // state 동시 실행해서 age만 바뀜
      >일반방식</button>
      


       {/* 함수형 업데이트 사용 방식 */}
       
      <button 
        type='button'
        onClick={()=>{
          setMember(prev=>({ ...prev, name : 'park'}))
          setMember(prev=>({ ...prev, age : 32}))
          // return과 중괄호를 같이 생략하면 오류발생할 경우 객체를 소괄호로 감싸면된다
          // name과 age 둘다 바뀜
        }}
      >함수형업데이트</button>
    
    </>
  )
}

export default UseState2