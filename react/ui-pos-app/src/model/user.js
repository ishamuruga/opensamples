export default class User {
    constructor(_id,_name,_email,_token,_roles){
        console.log(_token);
        this.id= _id;
        this.name = _name;
        this.token = _token;
        this.roles = _roles;
    }
}