

import React, { useState } from 'react'

const Test5_UseState = () => {
  const [name,setName] = useState('김자바');
  const [age,setAge] = useState('20');
  const [add,setAdd] = useState('울산시');

  // 객체의 스프레드 연산자
  let student = {
    stuNum : 1,
    name3 : 'kim',
    score : 80
  }
  const basicInfo = {
    addr : '울산시',
    age5 : 20
  }
  const result = {
    ...student,     
    // 스프레드를 안하면 student객체 통채로 result객체안에 들어온다 == 스프레드 안하면 중괄호 안에 중괄호가 온다
    // 스프레드 하면 중괄호 없이 student 객체 안에 있는 데이터 3개가 들어온다
    ...basicInfo,
    score : 100
  }
  // const result = {    스프레드 안하면 이렇게 들어온다 (객체 안에 객체)
  //   {
  //     stuNum : 1,
  //     name : 'kim',
  //     score : 80
  //   }
  //   {
  //     addr : '울산시',
  //     age5 : 20
  //   }
  //   score : 100
  // }

  // const result = {      스프레드 하면 이렇게 들어온다 (내용물만 들어옴)
  //   stuNum : 1,
  //   name : 'kim',
  //  X score : 80 X         객체명이 같으면 사라짐
  //   addr : '울산시',
  //   age5 : 20
  //   score : 100           score 80은 사라지고 score : 100만 남는다.
  // }


/////////////////////////////////////////////////
  const [man,setMan] = useState({
    name1 : '김자바',
    age1 : 20,
    add1 : '울산시'
  });

  return (
    <>

      <h3>이름 : {man.name1}</h3>
      <h3>나이 : {man.age1}</h3>
      <h3>주소 : {man.add1}</h3>

      <button type='button' onClick={()=>{
        // 스프레드로(껍질 깐 상태에서) name만 바꾸고 다시 객체로 넣어라
        setMan({
          ...man, 
          name1 : '홍길동'
        });
        
      }}>이름을 홍길동으로 변경</button>
      <button type='button' onClick={()=>{
        setMan({
          ...man,
          age1 : 30
        })
      }}>나이를 30으로 변경</button>
      <button type='button' onClick={()=>{
        setMan({
          ...man,
          add1 : '서울시'
        })
      }}>주소를 서울시로 변경</button>
      
      <br /><br /><br /><br />

      <span>이름 : </span>    
      <span>{name}</span>
      <br /><br />
      <span>나이 : </span>
      <span>{age}</span>
      <br /><br />
      <span>주소 : </span>
      <span>{add}</span>
      <br /><br />
      <button type='button' onClick={()=>setName('홍길동')}>이름을 홍길동으로 변경</button>
      <button type='button' onClick={()=>setAge(30)}>나이를 30으로 변경</button>
      <button type='button' onClick={()=>setAdd('서울시')}>주소를 서울시로 변경</button>






    
    </>
  )
}

export default Test5_UseState