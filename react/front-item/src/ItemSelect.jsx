import axios from 'axios';
import React, { useEffect, useState } from 'react'

const ItemSelect = () => {
  const [itemInfo, setItemInfo] = useState([{
    itemNum : ''
    , itemName : ''
    , itemPrice : ''
    , regDate : ''
  }]);

  // const handleItemInfo = e=>{
  //   setItemInfo({
  //     ...itemInfo
  //     ,[e.target.name] : e.target.value
  //   })
  // }

  useEffect(()=>{
    axios.get(`http://localhost:8080/item/select`)
    .then(res=>{
      console.log(res.data)
      console.log('통신성공')
      setItemInfo(res.data)
    })
    .catch(e=>{console.log(e)})
  },[])
  

  return (
    <>
      <h2>상품목록</h2>
      <table border={1}>
        <thead>
          <tr>
            <td>상품번호</td>
            <td>상품명</td>
            <td>가격</td>
            <td>등록일</td>
          </tr>
        </thead>
        <tbody>
          {
            // 조회되는 데이터가 없다면 '조회 결과가 없습니다 출력'
            // 조회되는 데이터가 있나? 행 개수만큼 TR 그린다 : 데이터가 없습니다. 그린다.
            itemInfo.length != 0 
            ? 
            itemInfo.map((e,i)=>{
              return (
                <tr key={i}>
                  <td>{e.itemNum}</td>
                  <td>{e.itemName}</td>
                  <td>{e.itemPrice}원</td>
                  <td>{e.regDate}</td>
                </tr>
              )
            })
            : 
            <tr>
              <td colSpan={4}>"조회 결과가 없습니다."</td>
            </tr> 
          }
          
        </tbody>
      </table>

    
    </>
  )
}

export default ItemSelect