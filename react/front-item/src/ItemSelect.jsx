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





  

  const selectData = ()=>{
    axios.get(`http://localhost:8080/item/select`)
    .then(res=>{
      console.log(res.data)
      console.log('통신성공')
      setItemInfo(res.data)
    })
    .catch(e=>{console.log(e)})
  }

  // 재조회를 위한 state 변수
  const [cnt, setCnt] = useState(0);
  // const [cnt, setCnt] = useState({});

  useEffect(()=>{
    selectData()
  },[cnt])
  // ㄴ> 마운트 + cnt 값이 변경되어서 리렌더링 될 경우 실행!
  // []이면 마운트때만 실행
  // [] 없다면 마운트 + 리렌더링  => 무한반복


  // 삭제 함수

  const deleteItem = (aa)=>{
    axios.delete(`http://localhost:8080/item/delete/${aa}`)
    .then(res=>{
      alert('삭제성공')
      // 1. 방금 삭제한 데이터는 표에서 삭제해달라
      // 2. 상품 목록을 다시 조회해서 표를 그려라
      setCnt(cnt+1)
      //setCnt({}) 이렇게 해도 주소가 다른 빈 객체로 바뀌게 되므로 cnt값이 변경됨
    })
    .catch(e=>console.log(e))
  }


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
            <td>삭제</td>
          </tr>
        </thead>
        <tbody>
          {
            // 조회되는 데이터가 없다면 '조회 결과가 없습니다 출력'
            // 조회되는 데이터가 있나? 행 개수만큼 TR 그린다 : 데이터가 없습니다. 그린다.
            itemInfo.length != 0 
            ? 
            itemInfo.map((item,i)=>{
              return (
                <tr key={i}>
                  <td>{item.itemNum}</td>
                  <td>{item.itemName}</td>
                  <td>{item.itemPrice}원</td>
                  <td>{item.regDate}</td>
                  <td>
                    <button 
                      type='button'
                      onClick={()=>deleteItem(item.itemNum)}
                    >삭제</button>
                  </td>
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