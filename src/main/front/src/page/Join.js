import {useEffect, useState} from "react";

const Join = ()=>{
    const [message, setMessage] = useState('');
    const [email, setEmail] = useState('');
    const [pw, setPw] = useState('');

    const handleEmail = (e)=>{
        setEmail(e.target.value);
    }

    const handlePw = (e)=>{
        setPw(e.target.value);
    }

    const ClickEvent = ()=>{
        console.log("button click! : "+email+", "+pw);
        fetch('/user/joinProc',{
            method:'POST',
            body : JSON.stringify({
                email : email, pw: pw
            })
        })
            .then(response=>response.text())
            .then(message=>{
                setMessage(message);
            })
    }

    useEffect(()=>{
        fetch('/join')
            .then(response=>response.text())
            .then(message=>{
                setMessage(message);
            });
    },[]);

    return (
        <div>
            회원가입 페이지입니다.
            <div>
                <span>이메일 : </span>
                <input type="email" name={email} onChange={handleEmail}/>
            </div>
            <div>
                <span>비밀번호 : </span>
                <input type="password" name={pw} onChange={handlePw}/>
            </div>
            <div>
                <button onClick={ClickEvent}>확인</button>
            </div>
            <div>{message}</div>
        </div>
    );
}

export default Join;