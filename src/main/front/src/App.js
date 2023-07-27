import {BrowserRouter} from "react-router-dom";
import {Route, Routes} from "react-router";
import Home from "./page/Home";
import Login from "./page/Login";

const App = ()=>{
  return(
      <div>
        <BrowserRouter>
          <Routes>
            <Route path="/" element={<Home/>}/>
            <Route path="/login" element={<Login/>}/>
          </Routes>
        </BrowserRouter>
      </div>
  );
}

export default App;