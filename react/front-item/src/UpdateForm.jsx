import axios from 'axios';
import React, { useState } from 'react'

const UpdateForm = () => {

  const [isShow, setIsShow] = useState(false);

  const [itemInfo, setItemInfo] = useState({
    itemNum : '',
    itemName : '',
    itemPrice : ''

  });

  const handleItemInfo = (e)=>{
    setItemInfo({
      ...itemInfo,
      [e.target.name] : e.target.value
    })
  }

  const updateItemInfo = ()=>{
    setIsShow(true)
    axios.put(`http://localhost:8080/item/update/${itemInfo.itemNum}`,itemInfo)
    .then(res=>{
      console.log('통신성공')
      console.log(res.data)
      setItemInfo(res.data)

    })
    .catch(e=>{
      console.log(e)
    })
  }

  return (
    <>
    
      <div>
        <span>상품번호</span>
        <input 
          type="text" 
          name='itemNum'
          value={itemInfo.itemNum}
          onChange={handleItemInfo}
        />
      </div>
      <div>
        <span>상품명</span>
        <input 
          type="text" 
          name='itemName'
          value={itemInfo.itemName}
          onChange={handleItemInfo}
        />
      </div>
      <div>
        <span>가격</span>
        <input 
          type="text" 
          name='itemPrice'
          value={itemInfo.itemPrice}
          onChange={handleItemInfo}
        />
      </div>
      <button 
        type='button'
        onClick={updateItemInfo}
      >수정</button>

      {
        isShow && 
        <div>
          <h3>수정된 정보</h3>
          <p>상품번호 : {itemInfo.itemNum}</p>
          <p>수정된 상품명 : {itemInfo.itemName}</p>
          <p>수정된 가격 : {itemInfo.itemPrice}</p>

        </div>
      }
      




    
    
    
    </>
  )
}

export default UpdateForm