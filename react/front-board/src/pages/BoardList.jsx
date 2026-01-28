import React, { useEffect, useState } from 'react'
import styles from './BoardList.module.css'
import axios from 'axios';

const BoardList = () => {

  // spring 에서 board 목록 정보 조회한 정보 저장 (배열)
  const [boardList, setBoardList] = useState([]);

  // 마운트 시점에 사원 목록 조회
  useEffect(()=>{
    axios.get(`http://localhost:8080/board/book`)
    .then(res=>{
      console.log(res.data);
      setBoardList(res.data);
    })
    .catch(e=>console.log(e))
  },[])
  





  return (
    <>
      <div className={styles.container}>
        <div className={styles.head}>
          <select className={styles.select} name="" id="">
            <option value="title">제목</option>
            <option value="writer">작성자</option>
          </select>

          <input 
            type="text" 
            className={styles.text}
            // name={}
            // value={}
            // onChange={}
          />

          <button 
            className={styles.button}
            type='button'
            // onClick={}
          >검색</button>
        </div>
  
        <div>
          <table className={styles.table}>
            {/* 테이블의 각 컬럼 너비값 지정 */}
            <colgroup>
              <col width={'10%'}/>
              <col width={'*'}/>
              <col width={'15%'}/>
              <col width={'25%'}/>
              <col width={'15%'}/>
            </colgroup>
            <thead className={styles.thead}>
              <tr>
                <td>No</td>
                <td>제목</td>
                <td>작성자</td>
                <td>작성일</td>
                <td>조회수</td>
              </tr>
            </thead>
            <tbody className={styles.tbody}>
              {
                boardList.map((e,i)=>{
                  return(
                    <tr key={i}>
                      <td>{e.boardNum}</td>
                      <td>{e.title}</td>
                      <td>{e.writer}</td>
                      <td>{e.createDate}</td>
                      <td>{e.readCnt}</td>
                    </tr>
                  )
                })
              }
            </tbody>
          </table>
        </div>
        <div className={styles.button2div}>
          <button 
            className={styles.button2}
            type='button'
            // onClick={}
          >글쓰기</button>
        </div>
      </div>




    </>
  )
}

export default BoardList