export class Student {
    id:number;
    name:string="";
    age:number = 0;

    constructor(_id:number,_name:string,_age:number){
        this.name = _name;
        this.age = _age;
        this.id = _id;
    }
}
