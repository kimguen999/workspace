import React from 'react'
import ChildProps from './ChildProps'
import Child2Props from './Child2Props'


// props를 이용해 컴포넌트가 데이터를 전달하는 것은 
// 부모 컴포넌트에서 자식컴포넌트로만 가능
// 형제 컴포넌트 끼리 데이터 전달 불가
// ex) parent -> child  O
// ex) parent -> child2 O
// ex) child  -> parent X
// ex) child  -> child2 X
const ParentProps = () => {

  const num = 10;

  return (
    <>
      <h2>Parent 컴포넌트</h2>
      <ChildProps myData={num} age={20} addr={'울산'}>
        {/* num data를 myData라는 이름으로 전달
            myData는 변수라서 viouhwovkfok 아무렇게나 적어도됨 */}
      </ChildProps>
      <Child2Props/>


    </>
  )
}

export default ParentProps