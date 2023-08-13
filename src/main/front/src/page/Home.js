import {useEffect, useState} from "react";
import Header from "../components/Header";
import Footer from "../components/Footer";

const Home = ()=>{
    const [message, setMessage] = useState("");
    useEffect(()=>{
        fetch('/home')
            .then(response => response.text())
            .then(message=>{
                setMessage(message);
            });
    },[]);

    return (
        <>
            <Header/>
            <div>
                홈 페이지 입니다.
                <div>{message}</div>
            </div>
            <Footer/>
        </>
    );
}

export default Home;