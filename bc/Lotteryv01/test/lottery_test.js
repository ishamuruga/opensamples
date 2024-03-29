const LotteryTest = artifacts.require("Lottery");

/*
 * uncomment accounts to access the test accounts made available by the
 * Ethereum client
 * See docs: https://www.trufflesuite.com/docs/truffle/testing/writing-tests-in-javascript
 */
contract("LotteryTest", function (accounts) {
  it("should assert true", async function () {
    console.log("===1");
    await LotteryTest.deployed();
    console.log("===2");
    return assert.isTrue(true);
  });

  it("call contract", async function () {
    const lt = await LotteryTest.deployed(); 
    const x = await lt.manager.call();
    
    const val = await lt.getAgesElements(0);
    console.log("vaal.." + val);
    const bal = await lt.getBalance();
    console.log("baal.." + bal);
    console.log("acct.." + accounts[0]);
    await lt.sendMoney({from:accounts[0],value:1})

    const bal2 = await lt.getBalance();
    console.log("baal2.." + bal2);
    console.log("Enter call");
    await lt.enter({from:accounts[0],value:100000000000000000})


    return assert.isTrue(true);
  });

  it("random",async ()=>{
    const lt = await LotteryTest.deployed(); 
    // const rnd = await lt.random();
    // console.log("#$#$#");
    // console.log(rnd);

    return assert.isTrue(true);
  });
});
