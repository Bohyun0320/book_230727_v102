import {useEffect, useState} from "react";
import Header from "../components/Header";
import Footer from "../components/Footer";

const Login = ()=>{
    const [message, setMessage]=useState("");
    const [email, setEmail] = useState("");
    const [pw, setPw] = useState("");

    const onLogin = () =>{
        console.log("login : "+ email +", "+pw);
    }
    useEffect(()=>{
        fetch('/login')
            .then(response=>response.text())
            .then(message=>{
                setMessage(message);
            });
    },[]);

    return (
        <>
            <Header/>
            <div>
                로그인 페이지입니다.
                <div>
                    <span> 이메일 : </span>
                    <input type="email" name={email}/>
                </div>
                <div>
                    <span> 비밀번호 : </span>
                    <input type="password" name={pw}/>
                </div>
                <div>
                    <button onClick={onLogin}>로그인</button>
                </div>
                <div>{message}</div>
            </div>
            <Footer/>
        </>
    );
}

export default Login;

