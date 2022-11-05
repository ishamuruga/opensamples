import axios from 'axios';

//import { accountService } from '_services';

export function jwtInterceptor() {
    
    axios.interceptors.request.use(request => {
        console.log("===============from AXIOS INTERCEPTORS..");
        let data = JSON.parse(sessionStorage.getItem("auth"));
        
        if (data){

            let token = data.token;
            
            if (request.url.indexOf("api/auth/signin") < 0) {
                request.headers.common.Authorization = `Bearer ${token}`;
            }
            
            //request.headers.common.Authorization = `Bearer ${account.token}`;
        }
        
        return request;
    });
}