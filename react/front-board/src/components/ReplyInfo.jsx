import axios from 'axios'
import React, { useEffect, useState } from 'react'
import BoardList from '../pages/BoardList';
import { useParams } from 'react-router-dom';
import { delReply, postReply, serchReply } from '../api/replyApi';

// {boardNum} : 구조분해할당
const ReplyInfo = ({boardNum}) => {
  // console.log(props); -> {boardNum : 3}

  // 댓글 목록 조회 데이터 저장할 state 변수
  const [replyList, setReplyList] = useState([]);


  // 마운트 시 댓글 목록 조회
  useEffect(()=>{              
    getReplyList()
  },[])


  // 댓글 목록 조회 함수
  const getReplyList=async()=>{
    const response = await serchReply(boardNum)
    setReplyList(response.data);
    
  }

  // 댓글 등록 저장 + 스프링으로 전달할 데이터를 저장할 state 변수
  const [replyData, setReplyData] = useState({
    writer : ''
    , content : ''
    , 'boardNum' : boardNum  
    , replyNum : ''  
    //앞에 boardNum은 키값, 뒤에 boardNum은 props를 통해 넘어온 boardNum이다.
  });

  // 값 입력시 실행 함수
  const handleReplyData = (e)=>{
    setReplyData({
      ...replyData,
      [e.target.name] : e.target.value
    })
  }

  //댓글등록 api
  const regReply = async ()=>{
    // writer or content 내용이 없으면
    if(replyData.writer==='' || replyData.content===''){
      alert('작성자 및 내용은 필수입력입니다.')
      return;  // 아무것도 없는 return은 그즉시 함수를 종료
    }
    await postReply(replyData);
    alert('댓글이 등록되었습니다.')
    setReplyData({
      ...replyData,
      writer : '',
      content : ''
    })
    getReplyList(); // 등록하자마자 댓글 목록 조회
      // replyData.writer=''
      // replyData.content=''
  }
  

  // 댓글 삭제 함수
  const deleteReply = async (replyNum)=>{
    const result = confirm('정말 삭제하시겠습니까?');
    if (result){
      const response = await delReply(replyNum);
        alert('댓글이 삭제되었습니다.');
        getReplyList();
      
      
    }
    
  }


  return (
    <div style={{marginTop : '20px'}}>
      <div style={{
        display : 'flex'
        , gap : '10px'

      }}>
        <input 
          style={{width : '20%'}}
          type="text"
          name='writer'
          value={replyData.writer}
          onChange={(e)=>{handleReplyData(e)}}
        />
        <input 
          style={{
            width : '70%'
          }}
          type="text" 
          name='content'
          value={replyData.content}
          onChange={(e)=>{handleReplyData(e)}}
        />
        <button 
          style={{
            width : '10%'
          }}
          onClick={(e)=>regReply(e)}
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
                  onClick={()=>{deleteReply(reply.replyNum)}}
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