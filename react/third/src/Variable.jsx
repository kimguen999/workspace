
import React from 'react'

// jsx에서는 변수를 html로 표현할 수 있다

const Variable = () => {
  // 자바스크립트 자리
  const num = 10;
  const name = 'kim';
  const arr = [1,2,'str']
  const flag = true;
  const data = null;
  // undefined : 정의되지 않음
  // 변수는 있지만 초기값이 없을때
  // 변수 선언이 되지 않았을때
  const data2 = undefined;
  // const num1 = 10;
  // console.log(num1);
  // let num2;
  // console.log(num2);
  const person = {
    name : "John",
    age : 40
  };


  return (
    <>
      <div className=''>{num}</div>
      <div>{name}</div>
      <div>{arr[1]}</div>
      <div>{arr}</div>
      <div></div>
      {/* boolean값, null, undifined은 출력되지 않음 */}
      <div>flag = {flag}</div>
      <div>data = {data}</div>
      <div>data2 = {data2}</div>
      <div>{person.name}</div>
      {/* <div>{person}</div> 객체 하나하나는 출력 가능하지만 객체 그자체를 출력하면 오류난다 */}
  </>
 )
}

// export 하지 않으면 다른 파일에서 import 불가
export default Variable