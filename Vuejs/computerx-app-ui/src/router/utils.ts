const canAccess = (to: any): boolean => {
    console.log(to.path)
    if (to.path === "/") {
        return true
    } else {
        let data = JSON.parse(sessionStorage.getItem("auth") + "")

        if (data) {
            return true
        } else {
            return false
        }
    }



}

export default canAccess;