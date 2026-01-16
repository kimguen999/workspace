

import React, { useState } from 'react'

const InputTest1 = () => {
  // const [name, setName] = useState('');
  // const [korScore, setKorScore] = useState('');
  // const [engScore, setEngScore] = useState('');
  // let sum = korScore + engScore;

  const [stuInfo, setStuInfo] = useState({
    name : '',
    korScore : 0,
    engScore : 0
  });

  // 입력정보 저장 함수
  const handleData = (asdf)=>{
    setStuInfo({
      ...stuInfo,
      [asdf.target.name] : asdf.target.value
    })
  }

  return (
    <>
      <div>
        <p>아래 이름, 국어점수, 영어점수를 INPUT 태그에 입력하면</p>
        <p>입력한 정보 및 총점을 화면에 보여주는 컴포넌트를 만드세요.</p>
      </div>
      <div>
        <h3>이름 : 
          <input 
            type="text" 
            name='name'
            value={stuInfo.name} 
            onChange={e=>handleData(e)}
          />
        </h3>
        <h3>국어점수 : 
          <input 
            type="text" 
            name='korScore'
            value={stuInfo.korScore} 
            onChange={e=>handleData(e)}
          />
        </h3>
        <h3>영어점수 : 
          <input 
            type="text" 
            name='engScore'
            value={stuInfo.engScore} 
            onChange={e=>handleData(e)}
          />
        </h3>
        <br />
      </div>
      <div>
        <p>입력한 학생 정보입니다.</p>
        <p>이름 : {stuInfo.name}</p>
        <p>국어점수 : {stuInfo.korScore}</p>
        <p>영어점수 : {stuInfo.engScore}</p>
        <p>총점 : {Number(stuInfo.korScore)+parseInt(stuInfo.engScore)}</p>
        {/* input 태그 안에 들어온건 문자열취급
            문자열을 숫자로 바꾸는 방법은 다양함
            1. Number()
            2. parseInt()
            3. 등등 */}
      </div>
    </>
  )
}

export default InputTest1