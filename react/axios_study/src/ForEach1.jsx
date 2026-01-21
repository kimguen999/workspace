import React from 'react'

const ForEach1 = () => {

  // 자바스크립트의 다양한 반복 문법
  const arr = [1,3,5,7,9]

  // 1. 일반 for문
  for (let i = 0; i < arr.length; i++) {
    console.log(arr[i]);
  }

  // 2. for-each문
  for(const e of arr){
    console.log(e)
  }

  // 3. for-each함수 - 반복실행 후 리턴 데이터가 없음
  // arr.forEach((배열에들어있는데이터,배열의위치)=>{
  //  반복할내용
  // });
  // 첫번째 매개변수 : 하나씩 뺀 데이터의 이름
  // 두번째 매개변수 : index
  const a = arr.forEach((e,i)=>{
    console.log(`e=${e}, i=${i}`)
    return 5;
  });
  
  // 4. map함수 - 반복실행 결과를 리턴
  // 그거 말고는 forEach 함수와 동일
  const b = arr.map((e,i)=>{
    console.log(`e=${e}, i=${i}`)
    return e;
  })

  console.log(a);
  console.log(b);

  return (
    <>
      <div></div>
    
    </>
  )
}

export default ForEach1