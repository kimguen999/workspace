import axios from 'axios';
import React, { useState } from 'react'

const ItemList = () => {

  const [itemList, setItemList] = useState([]);

  
  
  // const click=()=>{
  //   axios.get(`http://localhost:8080/items`)
  //   .then(res=>{
  //     console.log(res.data)
  //   })
  //   .catch(e=>console.log(e))
  // }

  return (
    <>
      <div>
        <table className='table'>
          <thead>
            <tr>
              <td>No</td>
              <td>상품명</td>
              <td>가격</td>
              <td>상품등록자</td>
              <td>등록일</td>
            </tr>
          </thead>
          <tbody>
            <tr>
              <td>5</td>
              <td>데님청바지</td>
              <td>50000</td>
              <td>김자바</td>
              <td>2026.02.10</td>
            </tr>
            <tr>
              <td></td>
              <td></td>
              <td></td>
              <td></td>
              <td></td>
            </tr>
          </tbody>
        </table>
      </div>
      <div>
        <button 
          type='button'
          onClick={(e)=>{click(e)}}
        >상품등록</button>
      </div>
    
    
    </>
  )
}

export default ItemList