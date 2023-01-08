const LotteryTest = artifacts.require("Lottery");

/*
 * uncomment accounts to access the test accounts made available by the
 * Ethereum client
 * See docs: https://www.trufflesuite.com/docs/truffle/testing/writing-tests-in-javascript
 */
contract("LotteryTest", function (/* accounts */) {
  it("should assert true", async function () {
    await LotteryTest.deployed();
    return assert.isTrue(true);
  });

  it("check baance", async function (accounts) {
    const lt = await LotteryTest.deployed();
    console.log(lt);
    return assert.isTrue(true);
  });
});
