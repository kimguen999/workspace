import { Link, Route, Routes } from "react-router-dom"
import Home from "./Home"
import First from "./First"


function App() {

  return (
    <>
      <h2>Router</h2>

      <div>
        {/* to 속성에는 route 컴포넌트에 작성한 path와 동일한 정보를 작성 */}
        <Link to={""}>home</Link>
        <Link to={"/first"}>first</Link>
        <Link to={"/second"}>second</Link>
      
      </div>

      {/* Routes 밖에 있으면 모든 태그에서 보임 */}
      <Routes>
        <Route 
          path="" 
          element={ <Home/> }
        />
        <Route 
          path="/first/:age/:name" // <-age=키값
          element={ <First/> }
        />
        <Route 
          path="/second" 
          element={<div>두번째 페이지</div>}
        />
        <Route 
          path="/third" 
          element={<div>세번째 페이지</div>}
        />
        <Route 
          path="*" //정의된 url이 아닌것을 적었을경우
          element={<div>없는 페이지입니다.</div>}
        />
      </Routes>
    </>
  )
}

export default App
