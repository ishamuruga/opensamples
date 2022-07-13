import { Subject,Of } from "rxjs";
import Config from "../model/config";
import axios from 'axios';


const doAuth = (auth) => {
    const user = {
        "username" : auth.email,
        "password" : auth.password
    };
    console.log(user);
    const requestOptions = {
        method: 'POST',
        headers: { 'Content-Type': 'application/json' },
        body: JSON.stringify(user)
    };

    const headers = { 
        'Authorization': 'Bearer my-token',
        'My-Custom-Header': 'foobar'
    };
    
    return axios.post(Config.url + Config.auth, user,{ headers });
    //return fetch(Config.url + Config.auth,requestOptions);
}



export {doAuth};