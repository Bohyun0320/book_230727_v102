import {useEffect, useState} from "react";

const Login = ()=>{
    const [message, setMessage]=useState("");
    useEffect(()=>{
        fetch('/login')
            .then(response=>response.text())
            .then(message=>{
                setMessage(message);
            });
    },[]);

    return (
        <div>
            로그인 페이지입니다.
            <div>{message}</div>
        </div>
    );
}

export default Login;

