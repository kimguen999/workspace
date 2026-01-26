import axios from 'axios'
import React, { useState } from 'react'

const ItemDetail = () => {
  

  // 상세정보 div 보임/숨기기 여부 저장 state
  const [isShow,  setIsShow] = useState(false);

  // 입력한 상품 번호를 저장할 state 변수
  const [itemInfo, setItemInfo] = useState({
    itemNum : ''
  })


  const handleItemInfo = ()=>{
    setIsShow(true) //조회눌렀을때 isShow를 true로 바꿔서 상품 정보 보이게끔 하는 함수
    axios.get(`http://localhost:8080/item/select/${itemInfo.itemNum}`)
    .then(res=>{
      console.log('통신성공');
      console.log(res.data);
      setItemInfo(res.data);
      // 자바에서 null값이 전달되면 빈문자('')로 받는다
    })
    .catch(e=>console.log(e))
  }

  // const change = (e)=>{
  //   setItemInfo({
  //     ...itemInfo, 
  //     itemNum : e.target.value})
  // }



  return (
    <>
      <div>
        상품번호
        <input 
          type="text" 
          name="itemNum"
          value={itemInfo.itemNum}
          onChange={(e)=>{
            setItemInfo({
              ...itemInfo, 
              itemNum : e.target.value})
          }}
          
        />
        <input 
          type="button" 
          value={'조회'}
          onClick={handleItemInfo}
        />
      </div>
      <br />

      {/* 단락평가 */}
      {
        isShow && 
        <div style={{
          backgroundColor : 'lightgray',
          width : '300px',
          padding : '20px',
          borderRadius : '15px',
          height : '270px'
        }}>
          <p>조회한 상품 정보입니다</p>
          <br />
          <p>상품번호 : {itemInfo.itemNum}</p>
          <p>상품명 : {itemInfo.itemName}</p>
          <p>가격 : {itemInfo.itemPrice}</p>
          <p>등록일 : {itemInfo.regDate}</p>
          <p>상품소개 : {itemInfo.itemIntro}</p>
        </div>
      
      }
      
    
    </>
  )
}
export default ItemDetail