
import axios from 'axios';
import React, { useState } from 'react'

const ItemForm = () => {

  const [itemInfo, setItemInfo] = useState({
    itemName : ''
    , itemPrice : ''
    , itemIntro : ''
  });
    
  const handleItemInfo = e=>{
    setItemInfo({
      ...itemInfo
      ,[e.target.name] : e.target.value
    })
  }
  console.log(itemInfo);

  // 등록 클릭 시 스프링으로 요청
  const click = ()=>{
      axios.post(`http://localhost:8080/item/post`,itemInfo)
    .then(res=>{
      alert('등록 성공')
    }).catch(e=>{
      console.log(e)
    })
  }
 

  return (
    <>
      <h2>상품등록</h2>
      <table>
        <tbody>
          <tr>
            <td>상품명</td>
            <td>
              <input 
                type="text" 
                name='itemName'
                value={itemInfo.itemName}
                onChange={e=>handleItemInfo(e)}
              /></td>
          </tr>
          <tr>
            <td>가격</td>
            <td>
              <input 
                type="text" 
                name='itemPrice'
                value={itemInfo.itemPrice}
                onChange={e=>handleItemInfo(e)}
              /></td>
          </tr>
          <tr>
            <td>상품소개</td>
            <td>
              <textarea 
              name="itemIntro" 
              value={itemInfo.itemIntro}
              onChange={e=>handleItemInfo(e)}
            ></textarea></td>
          </tr>
        </tbody>
      </table>
      <button 
        type='button'
        onClick={e=>click(e)}
      >등록</button>
    
    </>
  )
}

export default ItemForm