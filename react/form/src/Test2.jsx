
import React, { useState } from 'react'

const Test2 = () => {
  // 이름, 나이
  const [text, setText] = useState({
    name : '',
    age : '',
    grade : '1',
    gender : '남자',
    textarea : ''
  });
  const handleText = (e)=>{
    setText({
      ...text,
      [e.target.name] : e.target.value
    })
  }
  

  return (
    <>
      <div>
        <h3>이름 : 
          <input 
            type="text" 
            name='name'
            value={text.name}
            onChange={e=>handleText(e)}     
          />
        </h3>
        <h3>나이 : 
          <input 
            type="text"
            name='age'
            value={text.age}
            onChange={e=>handleText(e)}  
          />
        </h3>
        <h3>학년 : 
          <select 
            name='grade' 
            value={text.grade} 
            onChange={e=>handleText(e)}
          >
            <option value="1" name='1학년'>1학년</option>
            <option value="2" name='2학년'>2학년</option>
            <option value="3" name='3학년'>3학년</option>
            <option value="4" name='4학년'>4학년</option>
          </select></h3>
        <h3>성별 : 
          <input 
            type="radio"
            name='gender'
            id='rad'
            value='남자'
            checked={text.gender==='남자'}
            onChange={e=>handleText(e)}
          /> 
          남자
          <input 
            type="radio"
            name='gender'
            id='rad'
            value='여자'
            checked={text.gender==='여자'}
            onChange={e=>handleText(e)}
          /> 
          여자
        </h3>
        <h3>소개말 : 
          <textarea 
            cols="20" rows="4"
            name='textarea'
            value={text.textarea}
            onChange={e=>handleText(e)}
          ></textarea>
        </h3>

      </div>
      <div>
        <p>이름 : {text.name}</p>
        <p>나이 : {text.age}</p>
        <p>학년 : {text.grade}학년</p>
        <p>성별 : {text.gender}</p>
        <p>소개말 : {text.textarea}</p>
      </div>
    
    </>
  )
}

export default Test2