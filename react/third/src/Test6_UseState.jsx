import React, { useState } from 'react'
import './Test6_UseState.css'


const Test6_UseState = () => {

  const [num, setNum] = useState(0);

  const [isShow,setIsShow] = useState(false);

  return (
    <>
      <p>현재 카운트 : </p>
      <h2>{num}</h2>
      <button type='button' onClick={()=>setNum(num-1)}>-1</button>
      <button type='button' onClick={()=>setNum(num-10)}>-10</button>
      <button type='button' onClick={()=>setNum(num-100)}>-100</button>
      <button type='button' onClick={()=>setNum(num+100)}>+100</button>
      <button type='button' onClick={()=>setNum(num+10)}>+10</button>
      <button type='button' onClick={()=>setNum(num+1)}>+1</button>
      <br /><br /><br /><br />

      {/* jsx 인라인 스타일 문법 */}
      {/* 
      <div 
        style={{           {{}} style중괄호 안에 객체처럼 또 중괄호.
          color: 'white',
          width:'300px', 
          backgroundColor:'black',
          .....
        }}
      ></div>
      */}

      <div className='red'
        onMouseEnter={()=>{
          setIsShow(true);      //true도 되고 !isshow도 된다.
        }} onMouseLeave={()=>{
          setIsShow(false)    //false도 되고 !isshow도 된다.
      }}>
        <p>마우스를 올리면 숨겨진 글자가 보여요</p>
      </div>

      
      {/* 단락평가 (*자바스크립트* 문법) */}
      {/* 논리연산에서 사용(&&, ||)

          !!!!!논리연산자 전에 결과가 확정되면 앞에꺼만 해석하고 뒤에껀 적용X

          ex) 10>3 || 5<3; 일때 10이 3보다 크고 or이기 때문에 뒤에 5<3은 해석하지않음.(논리연산에서 true,false 정해지면 뒤에꺼 해석안함)
          ex) 10<3 && 5>3; 일때 10이 3보다 작고 and이기 때문에 뒤에 5>3은 해석하지않음.(논리연산에서 true,false 정해지면 뒤에꺼 해석안함)
          ex) console.log(true && 10); -> 10   참이고 10이므로 10 출력
          ex) console.log(true || 10); -> true 참이고 or이므로 어짜피 참이니 true 출력 
          
          3항연산자에서 else가 필요 없는 경우 '?' 대신 '&&' 넣고,
          else 구간인 ': null' 쓸 필요 없다. */}



      {/* TRUTHY -> true는 아닌데 true와 같은 결과로 판단 */}
      {/* FALSY -> false는 아닌데 false와 같은 결과로 판단 */}
      {/* truthy
            1. 0이 아닌 숫자는 true 취급
            2. 빈 문자열이 아닌 문자열은 true 취급 */}
      {/* falsy
            1. 0은 false 취급
            2. 빈 문자열('')은 false 취급
            3. null
            4. undefind
            5. NaN   (Not a Number)   ex) console.log('java'*10) -> NaN 출력 */}


      {    
        isShow &&
        <div className='blue'>
          <p>Hello React~</p>
        </div>
      }
      
    
    
    </>
  )
}

export default Test6_UseState