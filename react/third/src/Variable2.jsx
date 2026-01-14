
import React from 'react'

const Variable2 = () => {
  // 자바스크립트에서
  // == : 값만 비교, 자료형은 비교하지 않음
  // === : 값과 자료형 모두를 비교
  // ex)
  // 10 == '10'    -> true
  // 10 === '10'   -> false



  const num = 4;
  // 자바스크립트 자리에는 if, for 가능
  // let result = 0;
  // if(num % 2 === 0){
  //   result = 1;
  // } else {
  //   result = 2;
  // }
  let result = num % 2 === 0 ? 1 : 2;


  // num이 짝수면 1을 출력, 홀수면 2를 출력
  return (
    <>
      {/* return 안에는 if, for 못쓴다 */}
      {/* 하지만 3항 연산은 가능 (해석해서 값만 나오는 경우니까) */}
      {/* html 자리에 자바스크립트 코드를 쓰고 싶을 때 중괄호쓴다 */}
      <div>Variable2</div>
      <div>{result}</div>
      <div>{num % 2 === 0 ? 1 : 2}</div>

    </>
  )
}

export default Variable2