import React, { useState,useEffect } from 'react'
import { useNavigate } from 'react-router-dom';

export default function Login() {
    const navigate = useNavigate();
    const [login, setLogin] = useState({
        username: "usera",
        password: "user1"
    });

    const onHandleChange = (e) => {
        let { name, value } = e.target;
        console.log(name, value);
        setLogin((p) => {
            return {
                ...p,
                [name]: value
            }
        });
    }

    useEffect(()=>{ 
        sessionStorage.clear();
    },[]);

    const doSubmit = (e) => {
        e.preventDefault();
        console.log(login);
        let authObj={}
        if(login.username==='usera') {
            authObj = {
                user:'usera',
                role:'user',
                ts:new Date()
            }
        } else if (login.username==='userb') {
            authObj = {
                user:'userb',
                role:'admin',
                ts:new Date()
            }
        }
        sessionStorage.setItem("auth",JSON.stringify(authObj));
        navigate("/home");
    }

    return (
        <div>
            <form onSubmit={doSubmit}>
                <label>UserName</label>
                <input type="text" name="username" value={login.username} onChange={onHandleChange} />

                <label>password</label>
                <input type="password" name="password" value={login.password} onChange={onHandleChange} />

                <button>Login</button>
            </form>
        </div>
    )
}
