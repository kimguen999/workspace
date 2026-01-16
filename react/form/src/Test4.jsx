
import React, { useState } from 'react'
import './Test4.css'

const Test4 = () => {


  const [resume, setResume] = useState({
    education : '',
    schoolName : '',
    ph : '신입',
    licenseName : '',
    licenseDate : '',
    agency : '',
    comName : '',
    part : '',
    year : '',
    month : '',
    textarea : ''
  });

  const handleResume = e=>{
    setResume({
      ...resume,
      [e.target.name] : e.target.value
    })
  }

  return (
    <>
      <div className='container'>
        <h1>이력서 정보</h1>
        <h3 className='eduTitle'>학력</h3>
        <div className='eduTB'>
          <select 
            name='education'
            value={resume.education}
            onChange={e=>handleResume(e)}
          >
            <option value="대졸" name='대졸'>대졸</option>
            <option value="대졸예정" name='대졸예정'>대졸예정</option>
            <option value="초대졸" name='초대졸'>초대졸</option>
            <option value="고졸" name='고졸'>고졸</option>
          </select>
          <input 
            type="text" 
            name='schoolName'
            placeholder='학교명'
            value={resume.schoolName} 
            onChange={e=>handleResume(e)}
            />
        </div>

        <div className='ph'>
          <h3>지원구분</h3>
            <p>
              <input 
                type="radio" 
                name='ph' 
                id='a' 
                value='신입' 
                checked={resume.ph==='신입'} 
                onChange={e=>handleResume(e)}
              />신입
              <input 
                type="radio" 
                name='ph' 
                id='a' 
                value='경력' 
                checked={resume.ph==='경력'} 
                onChange={e=>handleResume(e)}
              />경력
            </p>
          
        </div>

        <h3>자격정보</h3>
        <table class="table">
          <thead>
            <tr>
              <td>자격증명</td>
              <td>취득일자</td>
              <td>발행기관</td>
            </tr>
          </thead>
          <tbody>
            <tr>
              <td>
                <input 
                  type="text" 
                  name='licenseName'
                  value={resume.licenseName} 
                  onChange={e=>handleResume(e)}
                />
              </td>
              <td>
                <input 
                  type="date" 
                  name='licenseDate'
                  value={resume.licenseDate} 
                  onChange={e=>handleResume(e)}
                />
              </td>
              <td>
                <input 
                  type="text" 
                  name='agency'
                  value={resume.agency} 
                  onChange={e=>handleResume(e)}
                />
              </td>
            </tr>
          </tbody>
        </table>
        <h3>경력정보</h3>
        <table class="table">
          <thead>
            <tr>
              <td>회사명</td>
              <td>담당업무</td>
              <td>경력기간</td>
            </tr>
          </thead>
          <tbody>
            <tr>
              <td>
                <input 
                  type="text" 
                  name='comName'
                  value={resume.comName} 
                  onChange={e=>handleResume(e)}
                />
              </td>
              <td>
                <input 
                  type="text" 
                  name='part'
                  value={resume.part} 
                  onChange={e=>handleResume(e)}
                />
              </td>
              <td className='yearmonth'>
                <input 
                  type="number" 
                  name='year'
                  value={resume.year} 
                  onChange={e=>handleResume(e)}
                />년
                <input 
                  type="number" 
                  name='month'
                  value={resume.month} 
                  onChange={e=>handleResume(e)}
                />개월
              </td>
            </tr>
          </tbody>
        </table>
        <h3>자기소개</h3>
        <textarea className='tt'
          cols="30" rows="3"
          name='textarea'
          value={resume.textarea}
          onChange={e=>handleResume(e)}
        ></textarea>
      </div>
      
      <div className='info1'>
        <p>학력 : {resume.education}</p>
        <p>학교명 : {resume.schoolName}</p>
        <p>지원구분 : {resume.ph}</p>
        <p>자격증명 : {resume.licenseName}</p>
        <p>취득일자 : {resume.licenseDate}</p>
        <p>발행기관 : {resume.agency}</p>
        <p>회사명 : {resume.comName}</p>
        <p>담당업무 : {resume.part}</p>
        <p>경력기간 : {resume.year}년 {resume.month}개월</p>
        <p>자기소개 : {resume.textarea}</p>
      </div>
      
    
    </>
  )
}

export default Test4