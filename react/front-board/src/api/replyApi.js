import axios from 'axios';



/**
 * 댓글 목록 조회
 * @param {number} boardNum 보드넘에 맞는 상세 들어가면 댓글 주르륵
 * @returns {Promise} 리턴된 데이터 정보
 */
export const serchReply = async(boardNum)=>{
  try{
    const response = await axios.get(`http://localhost:8080/replies/${boardNum}`);
    // 구조분해할당으로 인해 {params.boardNum} 쓸필요 없이 {boardNum}만 쓰면됨
    return response;
  }catch(e){
    console.log(e);
    console.log("조회오류");
  }
}



/**
 * 댓글 등록
 * @param {Object} replyData 등록할 댓글 정보
 * @param {string} replyData writer 댓글 작성자
 * @param {string} replyData content 댓글 내용
 * @param {number} replyData boardNum 댓글 게시글 번호
 * @param {number} replyData replyNum 댓글 고유번호
 * @returns {Promise}
 */
export const postReply = async (replyData)=>{
  try{
    await axios.post(`http://localhost:8080/replies`,replyData);
    
  } catch(e){
    console.log(e)
    console.log('등록오류')
  }
}

/**
 * 댓글 삭제
 * @param {number} replyNum 
 * @returns {Promise}
 */
export const delReply = async (replyNum)=>{
  try{
    const response = await axios.delete(`http://localhost:8080/replies/${replyNum}`);
    return response;
  } catch(e){
    console.log(e)
    console.log('삭제오류')
  }
}








