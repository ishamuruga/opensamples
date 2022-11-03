export default class User {
    constructor(_id,_name,_email,_token,_roles){
        this.id= _id;
        this.name = _name;
        this.email = _email;
        this.token = _token;
        this.roles = _roles;
    }
}