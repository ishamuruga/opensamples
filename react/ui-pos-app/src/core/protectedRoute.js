import React from 'react'
import { Navigate } from 'react-router-dom';

const ProtectedRoute = ({ user, children }) => {
    console.log("#### I am in Proted Route ")
    let data = JSON.parse(sessionStorage.getItem("auth"));
    if (data) {
        let token = data.token;
        console.log(">>#### I am in Proted Route Postive");
        return children;
    } else {
        console.log(">>#### I am in Proted Route Negative");
        return <Navigate to="/login" replace />;
    }
}

export default ProtectedRoute;