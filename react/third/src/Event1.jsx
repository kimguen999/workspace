
import React from 'react'

const Event1 = () => {
  // 함수는 자바스크립트 자리에 만든다
  // 버튼 클릭 시 실행 함수 (function, alert)
  function aaa(){
    alert(2);
  }

  const bbb = num=>alert(num);
  // == const bbb = (num) => {
  //      alert(num);
  //    }


  return (
    <>
      <div>Event1</div>
      <hr />
      <button type='button' onClick={()=>{
        alert(1);
      }}>클릭</button>
      <button type='button' onClick={()=>{
        console.log('hi');
        console.log('hello');
      }}>클릭2</button>
      {/* onChange : 값이 바뀔대마다 */}
      <input type="text" onChange={()=>{ 
        alert(2);
      }}/>
      {/* <input type="text" onChange={()=>{{aaa()}}}/>  가능*/}
      {/* <input type="text" onChange={aaa}/>  가능*/}
      {/* <input type="text" onChange={aaa()}/>  불가*/}

      <input type="text" onChange={()=>{
        bbb(5);
      }}/>

    </>
    
  )
}

export default Event1