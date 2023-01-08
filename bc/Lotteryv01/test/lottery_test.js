const LotteryTest = artifacts.require("Lottery");

/*
 * uncomment accounts to access the test accounts made available by the
 * Ethereum client
 * See docs: https://www.trufflesuite.com/docs/truffle/testing/writing-tests-in-javascript
 */
contract("LotteryTest", function (/* accounts */) {
  it("should assert true", async function () {
    console.log("===1");
    await LotteryTest.deployed();
    console.log("===2");
    return assert.isTrue(true);
  });

  it("call contract", async function (accounts) {
    const lt = await LotteryTest.deployed(); 
    const x = await lt.manager.call();
    
    const val = await lt.getAgesElements(0);
    console.log("vaal.." + val);
    return assert.isTrue(true);
  });
});
