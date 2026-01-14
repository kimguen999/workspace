

import React, { useState } from 'react'
import './Test1_UseState.css'   //  ./ : 현재파일 기준으로 == 같은 패키지
                                //  ./test : 현재파일 하위 폴더 test 안에

const Test1_UseState = () => {

  const [num, setNum] = useState(0);


  return (


    <>
      <div className='red_rect'>{num}</div>
      <button type='button' onClick={()=>{
        // 클릭할때마다 num값을 1씩 증가
        setNum(num+1);
      }}>클릭</button>

      






    </>
  )
}

export default Test1_UseState