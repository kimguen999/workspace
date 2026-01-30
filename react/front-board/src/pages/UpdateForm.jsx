import axios from 'axios'
import React, { useEffect, useState } from 'react'
import { useNavigate, useParams } from 'react-router-dom'

const UpdateForm = () => {
  const {boardNum} = useParams();  //자료형 객체
  console.log(boardNum);

  const nav = useNavigate();
  // const nav = navigator();
// 조회한 데이터를 저장할 state 변수
  const [boardInfo, setBoardInfo] = useState({
    
  });

  // 수정한 내용을 저장할 state 변수
  const [updateData, setUpdateData] = useState({
    title : ''
    ,content : ''
  });

 

  // 마운트될때 기존 내용이 보여야함(DB에서 조회)
  useEffect(()=>{
    axios.get(`http://localhost:8080/boards/update/${boardNum}`)
    .then((res)=>{
      console.log(res.data);
      setBoardInfo(res.data);
    })
    .catch(e=>console.log(e))
  },[])

  //입력한 값을 저장하는 함수
  const handleUpdateDate = e=>{
    setUpdateData({
      ...updateData,
      [e.target.name] : e.target.value
    })
  }

// 마운트시 실행x, boardInfo값이 변경될때만 실행
// boardInfo의 데이터를 updateData에 지정
  useEffect(()=>{
    // if(마운트가 아닐때만 ==> boardInfo가 빈객체가 아닐때만)
    if(Object.keys(boardInfo).length !== 0){   // 키의길이(키의갯수)가 0이라면
      // boardInfo 객체에 저장된 title, content 값을 updateDate에 저장
      setUpdateData({
        title : boardInfo.title
        , content : boardInfo.content
      })
      // updateData.title = boardInfo.title;
      // updateData.content = boardInfo.content;
    }
  },[boardInfo])

  // 수정함수
  const updateBoard = ()=>{
    axios.put(`http://localhost:8080/boards/${boardNum}`,updateData)
    .then(e=>{
      alert('수정완료')
      nav(`/detail/${boardNum}`)
    })
    .catch(
      e=>console.log(e)
    )
  }


  return (
    <>
      <div>
        <table style={{border:"1px solid black"}}>
          <tbody>
            <tr>
              <td>작성일</td>
              <td>{boardInfo.createDate}</td>
              <td>작성자</td>
              <td>{boardInfo.writer}</td>
            </tr>
            <tr style={{border:"1px solid black"}}>
              <td>제목</td>
              <td colSpan={3}>
                <input 
                  type="text" 
                  name="title"
                  // value와 onChange에서는 같은 데이터를 다루어야한다.
                  value={updateData.title}
                  onChange={e=>handleUpdateDate(e)}
                />
              </td>
            </tr>
            <tr>
              <td>내용</td>
              <td colSpan={3}>
                <textarea cols={50} rows={3} 
                  name="content" 
                  value={updateData.content}
                  onChange={e=>handleUpdateDate(e)}
                ></textarea>
              </td>
            </tr>
          </tbody>
        </table>
      </div>
      <div>
        <button 
          type='button'
          onClick={e=>{nav(`/detail/${boardNum}`)}}
        >뒤로가기</button>
        <button 
          type='button'
          onClick={e=>{updateBoard()}}
        >수정</button>
      </div>
    
    
    </>
  )
}

export default UpdateForm