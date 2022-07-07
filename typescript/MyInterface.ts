interface MyContract {
    name:string;

    doSomething(age:number) : Date;
}

let mCon:MyContract = {
    name:"super star",
    doSomething(a:number) : Date {
        return new Date()
    }
}

class MyContractImpl implements MyContract {
    name: string;
    doSomething(age: number): Date {
        throw new Error("Method not implemented.");
    }
    
}