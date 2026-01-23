import axios from 'axios'
import React, { useState } from 'react'

const ItemDetail = () => {

  const [itemInfo, setItemInfo] = useState({
    itemNum : '',
    itemName : '',
    itemPrice : '',
    regDate : '',
    itemIntro : ''
  })


  const handleItemInfo = ()=>{
    axios.get(`http://localhost:8080/item/select/${itemInfo.itemNum}`)
    .then(res=>{
      console.log('통신성공');
      setItemInfo(res.data);
    })
    .catch(e=>console.log(e))
  }

  const change = (e)=>{
    setItemInfo({...itemInfo, itemNum : e.target.value})



  }



  return (
    <>
      <div>
        상품번호
        <input 
          type="text" 
          name="itemNum"
          value={itemInfo.itemNum}
          onChange={(e)=>{
            setItemInfo({...itemInfo, itemNum : e.target.value})
          }}
        />
        <input 
          type="button" 
          value={'조회'}
          onClick={handleItemInfo}
        />
      </div>
      <div>
        <p>조회한 상품 정보입니다</p>
        <br />
        <p>상품번호 : {itemInfo.itemNum}</p>
        <p>상품명 : {itemInfo.itemName}</p>
        <p>가격 : {itemInfo.itemPrice}</p>
        <p>등록일 : {itemInfo.regDate}</p>
        <p>상품소개 : {itemInfo.itemIntro}</p>
      </div>
    
    </>
  )
}
export default ItemDetail