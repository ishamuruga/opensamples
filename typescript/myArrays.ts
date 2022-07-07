import User from "./User";

let salaries:number[] = [1,2,3,4,5,6,7,8,89,9];

let response:number[] = salaries.map(x=>{
    x = x+10;
    return x;
});

//console.log(response);
//console.log(salaries);

 let users:User[] = [
     {id:1,name:"test123"},
     {id:2,name:"test153"},
     {id:3,name:"test1783"},
     {id:4,name:"test443"},
 ]

let res1 = users.map(x=>{
    if (x.id===1) {
        x.name = `${x.name} + ..processed`;
    }
    return x;
 }).map(x=>{
    if (x.id===3) {
        x.name = `${x.name} + ..processed again`;
    }
    return x;
 }).filter(x=>{
    if (x.id % 2 ==0){
        return false;
    } else {
        return true;
    }
 })

 console.log(res1);