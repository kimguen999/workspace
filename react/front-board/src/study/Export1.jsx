import React from 'react'
// js 파일의 변수 및 함수 import 방식 1
import { age, test1 } from '../util/myMath'

// import { 구조분해할당 변수 } from ~
// import 컴포넌트 from ~   -> 이 경우 객체 형식으로 가져옴

// ./ -> 같은 폴더 내
// ../ -> 상위 폴더 내
// ../../ -> 상위 상위 폴더 내 

// js, jsx는 확장자 생략 가능, css는 생략 불가


// js 파일의 변수 및 함수 import 방식 2
import * as fun from '../util/myMath'
// myMath 컴포넌트 전체를 fun이라는 별칭으로 가져오겠다 -> 객체 형식으로 가져옴


const Export1 = () => {

  const data1 = age
  test1();

  console.log(fun.name);
  fun.test2();


  return (
    <>
    
    
    
    </>
  )
}

export default Export1
// export default가 있으면 이름을 마음대로 못바꾸고 그대로 써야함