import {BrowserRouter} from "react-router-dom";
import {Route, Routes} from "react-router";
import Home from "./page/Home";
import Login from "./page/Login";
import Join from "./page/Join";
import Main from "./page/Main";

const App = ()=>{
  return(
      <div>
        <BrowserRouter>
          <Routes>
            <Route path="/" element={<Home/>}/>
            <Route path="/user/login" element={<Login/>}/>
              <Route path="/user/join" element={<Join/>}/>
              <Route path="/main" element={<Main/>}/>
          </Routes>
        </BrowserRouter>
      </div>
  );
}

export default App;