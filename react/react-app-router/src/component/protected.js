import React from 'react';
import { Navigate} from 'react-router-dom';
import { acl } from './acl';


const Protected = ({ name, children }) => {
    console.log(sessionStorage.getItem("auth"));
    let useAuth =  JSON.parse(sessionStorage.getItem("auth"));
    console.log(useAuth);

    if (!useAuth) {
        return <Navigate to="/" replace />;
      }

    let role = useAuth.role;
    let canProceed=false;

    
    Object.keys(acl).map(x=>{
        console.log(x);
        if (x===name) {
            let roless= acl[x];
            if (acl[x].includes(role) || acl[x].includes("**")){
                canProceed= true;
            }
        }

    })

    if (canProceed){
        return children;    
    } else {
        return <Navigate to="/" replace />;
    }
     
  };

  export default Protected;