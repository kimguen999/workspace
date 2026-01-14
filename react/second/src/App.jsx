// import { useState } from 'react'
// import reactLogo from './assets/react.svg'
// import viteLogo from '/vite.svg'
// import './App.css'

import Header from "./Header"; // 외부에서 다른 컴포넌트 가져올때.
import Footer from "./Footer";


// 자바스크립트에서 함수는 소문자가 관례
// react, jsx에서는 함수가 무조건 소문자
// 함수형태인데 대문자로 시작 -> 컴포넌트(Conponent)
// 컴포넌트 : 한 화면을 조립하기 전 파트 같은 것
// 컴포넌트의 리턴문에 html코드(ex div, 등)가 있으면 화면에 그려준다
// 컴포넌트 단축키 : rafce

function App() { // <-컴포넌트
  // const [count, setCount] = useState(0)
  // 자바스크립트 자리
  let str = 'hi';
  let num = 10;
  let num2 = 1;

  return (  
    // 리턴문 안에는 html 자리
    // 리턴문 안에 html코드는 반드시 하나의 태그에 포함되어야함
    // (div가 2개 이상이라면 1개로 감싸야함)
    // 변수는 중괄호안에.
    <div>
      <Header />
      {/* <Header />   == <Header></Header> */}
      {/* 열자마자 닫는것 <  /> (시작태그+마감태그)  ex <div /> */}
      <input type="text" />
      <br />
      <hr />
      <div>
        <div>soifjsoij</div>
        <div>{str}</div>
        <div>{num}</div>
        <div>{num}-{num2}</div>
        <div>{num-num2}</div>
      </div>
      <Footer />
    </div>  
  )
}



// 화살표 함수 표현식으로 컴포넌트 표현
// const Footer = ()=>{
// return(
//     <div>
//       <div>footer</div>
//     </div>
//   )
// }
  


export default App
