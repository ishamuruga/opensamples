//import { Customer } from './myfolder/Customer';
//import User from './myfolder/User';

import {Customer, User} from './myfolder';


//union data type
let nameorage:number | string | Boolean = "";

nameorage = "Virtusa";
nameorage = 100*2;

//tuple
let customer:[number,string,Date,User] = [123,"Test",new Date(),{id:1,name:"test123"}];

customer[1]="Abcd";
customer[0]=12;

customer[3] = {
    id:45,
    name:"new name"
}

let data:any = 123;
data = 100;
console.log(data *2);

data = "string data";
console.log(`${data} is a new data`);