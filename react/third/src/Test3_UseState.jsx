

import React, { useState } from 'react'

const Test3_UseState = () => {
  const [btn, setBtn] = useState("광고닫기");
  const [isShow, setIsShow] = useState(true);


  // 버튼 눌렀을때 버튼 자체가 바뀌는거
  // 문장 생성 하고 안하고니까 생성과 공백 만들기
  // 생성은 true에 연결, 공백은 false에 연결
  // 클릭 시 true와 false가 바뀌도록 연결

  return (
    <>

      <button type='button' onClick={()=>{
        setBtn(btn==="광고닫기" ? "광고보기" : "광고닫기")
        // setDis(dis==="광고닫기" ? "광고보기" : "광고닫기")
        setIsShow(!isShow);  // true면 false로, false면 true로
      }}>{btn}</button>

      {
        isShow 
        ? 
        <h2>오늘 구매하시면 30% SALE!!!</h2> // true 일때 문장 생성
        : 
        null  //false 일때 공백
      }


    </>
  )
}

export default Test3_UseState