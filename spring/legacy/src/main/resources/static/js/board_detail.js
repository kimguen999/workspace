
const deleteBoard = (boardNum)=>{
  const result = confirm('삭제할까요')
  if(result){
    location.href=`/boards/delete?boardNum=${boardNum}`
  }
}


const deleteReply = (boardNum, replyNum)=>{
  const result = confirm('삭제할까요')
  if(result){
    location.href = `/reply/delete?replyNum=${replyNum}&boardNum=${boardNum}`
  }
}