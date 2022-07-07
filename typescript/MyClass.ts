abstract class Animal {
    public name:string="";

    protected age:number =0 ;

    constructor(_name:string){
        this.name = _name;
    }

    doCall = () => this.name;
}

class Tiger extends Animal {
    age:number=0;

    constructor(_age:number,_name:string) {
        super(_name);
        this.age= _age;

    }

    canKill():boolean {
        return true;
    }
}

let tgr:Tiger = new Tiger(45,"Bengal Tiger");
console.log(tgr.canKill());
console.log(tgr.doCall());