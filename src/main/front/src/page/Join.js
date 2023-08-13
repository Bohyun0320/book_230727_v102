import {useEffect, useState} from "react";
import Header from "../components/Header";
import Footer from "../components/Footer";
import React from "react";
import {useNavigate} from "react-router";




const Join = ()=>{
    const navigate = useNavigate();
    const [message, setMessage] = useState('');
    const [email, setEmail] = useState('');
    const [pw, setPw] = useState('');
    const [pwCheck, setPwCheck] = useState('');
    const [name, setName] = useState('');
    const [birthY, setBirthY] = useState('');
    const [birthM, setBirthM] = useState('');
    const [birthD, setBirthD] = useState('');
    const [emailMessage, setEmailMessage] = useState('');
    const [pwMessage, setPwMessage] = useState('');
    const [pwCheckValidMessage, setPwCheckValidMessage] = useState('');

    const handleEmail = (e)=>{
        setEmail(e.target.value);
        const emailRegex = /^[a-z0-9_+.-]+@([a-z0-9-]+\.)+[a-z0-9]{2,4}$/;
        if(emailRegex.test(email)){
            setEmailMessage('');
        }else{
            setEmailMessage('이메일 형식에 맞게 작성해주세요.');
        }
    }

    const handlePw = (e)=>{
        setPw(e.target.value);
        const pwRegex = /^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@#$%^&*-]).{8,12}$/;
        if(pwRegex.test(pw)) {
            setPwMessage('');
        }else{
            setPwMessage('대문자, 소문자, 숫자(0~9), 특수문자(!@#$%^&*-)로 구성된 8자리 이상 12자리 이하 비밀번호로 입력해주세요.');
        }
    }

    const handlePwCheck = (e)=>{
        setPwCheck(e.target.value);
        console.log('f'+pwCheck);
    }
    const isPwSame = pw === pwCheck;

    useEffect(()=>{
        if(isPwSame){
            setPwCheckValidMessage('');
        }else{
            setPwCheckValidMessage('비밀번호가 일치하지 않습니다.');
        }
    },[email, pw, pwCheck, birthY, birthM, birthD]);

    const handleName = (e)=>{
        setName(e.target.value);
    }

    const handleBirthY = (e)=>{
        setBirthY(e.target.value);
    }

    const handleBirthM = (e)=>{
        setBirthM(e.target.value);
    }

    const handleBirthD = (e)=>{
        setBirthD(e.target.value);
    }

    const YEAR = [];
    const nowYear = new Date().getFullYear();
    for(let i = 1960; i<= nowYear; i++){
        YEAR.push(i);
    }

    const MONTH = [];
    for(let i = 1; i<=12; i++){
        MONTH.push(i);
    }

    const DAY = [];
    for(let i = 1; i<=31; i++){
        let d = String(i).padStart(2,'0');
        DAY.push(d);
    }

    const nullOrEmpty = (val)=>{
        if(val == ""||val == null||val==undefined||val==0||val==NaN){
            return false;
        }else{
            return true;
        }
    }


    const ClickEvent = ()=>{
        if(nullOrEmpty(email)&&nullOrEmpty(pw)&&nullOrEmpty(name)&&nullOrEmpty(birthY)&&nullOrEmpty(birthM)&&nullOrEmpty(birthD)){
            fetch('/user/joinProc',{
                method:'POST',
                headers: { 'Content-Type': 'application/json' },
                body : JSON.stringify({
                    "email" : email,
                    "pw": pw,
                    "name":name,
                    "birthY":birthY,
                    "birthM":birthM,
                    "birthD" : birthD
                })
            })
                .then(response=>response.text())
                .then(message=>{
                    setMessage(message);
                    navigate("/user/login");
                })
        }else{
            alert('빈값을 입력해주세요!');
        }
    }

    useEffect(()=>{
        fetch('/user/join')
            .then(response=>response.text())
            .then(message=>{
                setMessage(message);
            });
    },[]);

    return (
        <div>
            <Header/>
            <div>
                회원가입 페이지입니다.
                <div>
                    <span>이메일 : </span>
                    <input type="email" name={email} onChange={handleEmail}/><br/>
                    <span>{emailMessage}</span>
                </div>
                <div>
                    <span>비밀번호 : </span>
                    <input type="password" name={pw} onChange={handlePw}/><br/>
                    <span>{pwMessage}</span>
                </div>
                <div>
                    <span>비밀번호 확인 : </span>
                    <input type="password" name={pwCheck} onChange={handlePwCheck}/><br/>
                    <span>{pwCheckValidMessage}</span>
                </div>
                <div>
                    <span>이름 : </span>
                    <input type="text" name={name} onChange={handleName}/>
                </div>
                <div>
                    <span>생일 : </span>
                    <div>
                        <select id={birthY} name={birthY} onChange={handleBirthY}>
                            {YEAR.map(y=>{
                                return <option value={y}>{y}</option>;
                            })}
                        </select>
                        <select id={birthM} name={birthM} onChange={handleBirthM}>
                            {MONTH.map(m =>{
                                return <option value={m}>{m}</option>
                            })}
                        </select>
                        <select id={birthD} name={birthD} onChange={handleBirthD}>
                            {DAY.map(d=>{
                                return <option value={d}>{d}</option>
                            })}
                        </select>
                    </div>
                </div>

                <div>
                    <button onClick={ClickEvent}>확인</button>
                </div>
                <div>{message}</div>
            </div>
            <Footer/>
        </div>
    );
}

export default Join;