import axios from 'axios';


// 게시판 테이블과 관련된 api 요청을 보내는 함수 모음 파일

/**
 * 게시글 목록 조회 api 요청 함수
 * @param {Object} searchData  검색데이터이다, 파라미터(매개변수) {자료형} 이름
 * @param {string} searchData.searchKeyword  검색키워드
 * @param {string} searchData.searchValue  검색내용
 * @returns {Promise}   리턴된 데이터 정보
 */
export const getList = async (searchData)=>{
  try{
    const response = await axios.get(
      `http://localhost:8080/boards`
      , {params : searchData}
    );
    console.log(response.data);
    return response;
  } catch(e){
    console.log("오류발생")
    console.log(e.response)  // 오류발생시 응답 정보
    console.dir(e)
  }
}

/**
 * 게시글 등록
 * @param {Object} boardData 
 * @returns {Promise}
 */
export const save = async (boardData)=>{
  try{
    const response = await axios.post('http://localhost:8080/boards', boardData);
    return response;
  }catch(e){
    console.log(e)
    console.log("게시글 등록 중 오류 발생")
  }
}


/**
 * 게시글 삭제
 * @param {number} boardNum 삭제할 게시글 번호
 * @returns {Promise}
 */
export const delBoard = async (boardNum)=>{
  try{
    const response = await axios.delete(`http://localhost:8080/boards/${boardNum}`);
    return response;
  }catch(e){
    console.log(e);
    console.log('게시글 삭제 중 오류');
  }
}



