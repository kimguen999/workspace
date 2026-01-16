

import React, { useState } from 'react'

const Test3 = () => {

  const [ckin, setCkin] = useState({
    chicken : '후라이드 치킨',
    cnt : '',
    date : '',
    textarea : ''
  })
  
  const handleCkin = e=>{
    setCkin({
      ...ckin,
      [e.target.name] : e.target.value
    })
  }

  return (
    <>
      <h1>치킨!!!</h1>
      <h3>치킨 종류와 상관 없이 무조건 만원!</h3>
      <div>
        <input
          type="radio" 
          name='chicken' 
          id = 'chi'
          value='후라이드 치킨' 
          checked={ckin.chicken==='후라이드 치킨'} 
          onChange={(e)=>handleCkin(e)} 
        /> 후라이드 치킨
        <input
          type="radio" 
          name='chicken' 
          id = 'chi'
          value='양념 치킨' 
          checked={ckin.chicken==='양념 치킨'} 
          onChange={(e)=>handleCkin(e)} 
        /> 양념 치킨
        <input
          type="radio" 
          name='chicken' 
          id = 'chi'
          value='간장 치킨' 
          checked={ckin.chicken==='간장 치킨'} 
          onChange={(e)=>handleCkin(e)} 
        /> 간장 치킨
      </div>
      <div>
        <input
          type="radio" 
          name='chicken' 
          id = 'chi'
          value='고추바사삭' 
          checked={ckin.chicken==='고추바사삭'} 
          onChange={(e)=>handleCkin(e)} 
        />고추바사삭
        <input
          type="radio" 
          name='chicken' 
          id = 'chi'
          value='뿌링클' 
          checked={ckin.chicken==='뿌링클'} 
          onChange={(e)=>handleCkin(e)} 
        />뿌링클
        <input
          type="radio" 
          name='chicken' 
          id = 'chi' 
          value='매운핫치킨' 
          checked={ckin.chicken==='매운핫치킨'} 
          onChange={(e)=>handleCkin(e)} 
        />매운핫치킨
      </div>
      <h3>
        몇마리 :  
        <input 
          type="number" 
          name='cnt'
          value={ckin.cnt} 
          onChange={e=>handleCkin(e)}
        />
      </h3>
      <h3>
        주문일 :
        <input 
          type="date" 
          name='date'
          value={ckin.date}
          onChange={e=>handleCkin(e)}
        />
      </h3>
      <h3>요청사항</h3>
      <textarea 
        cols="30" rows="3"
        name='textarea'
        value={ckin.textarea} 
        onChange={e=>handleCkin(e)}
      ></textarea>
      <br /><br /><br />

      <div>
        <h2>주문 확인</h2>
        <h3>치킨 : {ckin.chicken}</h3>
        <h3>몇마리 : {ckin.cnt}</h3>
        <h3>주문일 : {ckin.date}</h3>
        <h3>요청사항 : {ckin.textarea}</h3>
      </div>

    </>
  )
}

export default Test3