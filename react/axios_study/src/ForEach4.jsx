import React from 'react'

const ForEach4 = () => {

  const stuList = [{
    stuNum : 1,
    stuName : 'kim',
    stuScore : 90
  },
  {
    stuNum : 2,
    stuName : 'lee',
    stuScore : 80
  },
  {
    stuNum : 3,
    stuName : 'park',
    stuScore : 100
  }];

  return (
    <>
      <table border={1}>
        <thead>
          <tr>
            <td>학번</td>
            <td>이름</td>
            <td>점수</td>
          </tr>
        </thead>
        <tbody>
          {
            stuList.map((e,i)=>{
              return (
                <tr key={i}>
                  <td>{e.stuNum}</td>
                  <td>{e.stuName}</td>
                  <td>{e.stuScore}</td>
                </tr>
              )
            })
          }
        </tbody>
      </table>
    
    </>
  )
}

export default ForEach4