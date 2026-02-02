import axios from 'axios'
import React, { useEffect, useState } from 'react'
import BoardList from '../pages/BoardList';

// {boardNum} : 구조분해할당
const ReplyInfo = ({boardNum}) => {
  // console.log(props); -> {boardNum : 3}

  // 댓글 목록 조회 데이터 저장할 state 변수
  const [replyList, setReplyList] = useState([]);

  // 마운트 시 댓글 목록 조회
  useEffect(()=>{              
    axios.get(`http://localhost:8080/replies/${boardNum}`)
    // 구조분해할당으로 인해 {params.boardNum} 쓸필요 없이 {boardNum}만 쓰면됨
    .then(response => {
      console.log(response.data);
      setReplyList(response.data);
    })
    .catch(e=>console.log(e))
  },[])



  return (
    <div style={{marginTop : '20px'}}>
      <div style={{
        display : 'flex'
        , gap : '10px'

      }}>
        <input 
          style={{width : '20%'}}
          type="text"
          // name=''
          // value={}
          // onChange={}
        />
        <input 
          style={{
            width : '70%'
          }}
          type="text" 
          // name=''
          // value={}
          // onChange={}
        />
        <button 
          style={{
            width : '10%'
          }}
          type='button'
        >댓글등록</button>
      </div>

      {/* 댓글 하나 태그 */}
      {
        replyList.map((reply, i)=>{
          return(
            <div 
              key={i}
              style={{
                marginTop : '16px'
                , border : '1px solid black'
              }}>
              <div style={{display : 'flex', gap : '8px'}}>
                <img 
                  style={{
                    background : 'gray'
                    , borderRadius : '50%'
                    , width : '30px'
                  }}
                  src="/face-02.jpg"
                />
                <div style={{}}>
                  <p>{reply.writer}</p>
                  <p style={{color : 'gray'}}>{reply.regDate}</p>
                </div>
              </div>
              <div style={{
                display : 'flex'
                , justifyContent : 'space-between'
              }}>
                <p 
                  style={{}}
                >{reply.content}</p>
                <button
                  style={{}}
                  type='button'
                >삭제</button>
              </div>
            </div>
          )
        })
      }
    
    
    
    </div>
  )
}

export default ReplyInfo