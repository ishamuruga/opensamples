const getAuthToken = () => {
    let authData = sessionStorage.getItem("auth");
    console.log(authData);
}

export {getAuthToken}