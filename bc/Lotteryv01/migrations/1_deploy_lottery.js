const SimpleStorage = artifacts.require("Lottery");

module.exports = function (deployer) {
  console.log("In Deploy Function.....");
  deployer.deploy(SimpleStorage);
};
