const assert = require("assert");
const ganacheCli = require("ganache-cli");
const ganache = require("ganache");
const Web3 = require("web3");
const {interface,bytecode} = require('../compile');
const { doesNotMatch } = require("assert");

//const web3 = new Web3(ganache.provider());
const web3 = new Web3(new Web3.providers.HttpProvider('http://127.0.0.1:7545'))

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
let inbox;
const INIT_MESSAGE="Hi There!";
beforeEach(async ()=>{
    console.log("===>Before-each")
    car = new Car();

    // web3.eth.getAccounts().then((myAccounts)=>{
    //     accounts = myAccounts;
    // })

    accounts = await web3.eth.getAccounts();

    //console.log(interface);

    inbox = await new web3.eth.Contract(JSON.parse(interface))
          .deploy({data:bytecode,arguments:[INIT_MESSAGE]})
          .send({from:accounts[0],gas:'1000000'});

    
})

describe("Car Test",()=>{
    //it("test1--can park",()=>{
        //const car = new Car();
        //assert.equal(car.park(),"stopped");
        //console.log(accounts);
        //console.log(accounts.length);
        //console.log(accounts[0]);
    //});

    //it("test2--can drvive",()=>{
        //const car = new Car();
    //    assert.equal(car.drive(),"vroom");
    //});

    it("Deploy Inbox Contract", ()=> {
        //console.log(inbox);
        console.log("===");
        console.log(inbox.options.address);
        console.log(accounts[0]);
        console.log("===");
        
        assert.ok(inbox.options.address);
    });

    it("has a default message",async ()=>{
        const message = await inbox.methods.message().call();
        assert.equal(message,INIT_MESSAGE);
    });

    it("can change the message",async ()=>{
        await inbox.methods.setMessage("bye").send({from:accounts[0]});
        const message = await inbox.methods.message().call();
        assert.equal(message,"bye");
    });
})