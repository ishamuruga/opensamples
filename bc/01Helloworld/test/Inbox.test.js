const assert = require("assert");
const ganacheCli = require("ganache-cli");
const ganache = require("ganache");
const Web3 = require("web3");

const web3 = new Web3(ganache.provider());

class Car {
    park(){
        return 'stopped';
    }

    drive(){
        return 'vroom';
    }
}

let car;
let accounts;
beforeEach(()=>{
    console.log("===>Before-each")
    car = new Car();

    web3.eth.getAccounts().then((myAccounts)=>{
        accounts = myAccounts;
    })
})

describe("Car Test",()=>{
    it("test1--can park",()=>{
        //const car = new Car();
        assert.equal(car.park(),"stopped");
        console.log(accounts);
    });

    it("test2--can drvive",()=>{
        //const car = new Car();
        assert.equal(car.drive(),"vroom");
    })
})