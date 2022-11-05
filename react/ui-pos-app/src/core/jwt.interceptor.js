import axios from 'axios';

//import { accountService } from '_services';

export function jwtInterceptor() {
    
    axios.interceptors.request.use(request => {
        console.log("===============from AXIOS INTERCEPTORS..");
        let data = JSON.parse(sessionStorage.getItem("auth"));
        
        if (data){
            //console.log("$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
            //console.log(data)
            //console.log(data.id)
            //console.log(data.token);
            let token = data.token;
            
            if (request.url.indexOf("api/auth/signin") < 0) {
                request.headers.common.Authorization = `Bearer ${token}`;
            }
            
            //request.headers.common.Authorization = `Bearer ${account.token}`;
        }
        //console.log("#.." + request.url.indexOf("api/auth/signin"))

        //console.log(request.url);
        
        
        // add auth header with jwt if account is logged in and request is to the api url
        //const account = accountService.accountValue;
        //const token = sessionStorage.getItem("auth")
        //const isLoggedIn = account?.token;
        //const isApiUrl = request.url.startsWith(process.env.REACT_APP_API_URL);

        //if (isLoggedIn && isApiUrl) {
        //    request.headers.common.Authorization = `Bearer ${account.token}`;
        //}

        return request;
    });
}