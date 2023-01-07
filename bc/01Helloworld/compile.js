const path = require("path");
const fs = require("fs");
const solc = require("solc");


const inboxSolName = path.resolve(__dirname,'contracts','Inbox.sol');

const source = fs.readFileSync(inboxSolName,'utf8');

//console.log(source);


//module.exports = solc.compile(source,1).contracts[':Inbox'];

var input = {
    language: 'Solidity',
    sources: {
      'Inbox.sol': {
        content: source
      }
    },
    settings: {
      outputSelection: {
        '*': {
          '*': ['*']
        }
      }
    }
  };
  var output = JSON.parse(solc.compile(JSON.stringify(input)));
  
  var bytecode;
  var interface;
  // `output` here contains the JSON output as specified in the documentation
  for (var contractName in output.contracts['Inbox.sol']) {
    // console.log(
    //   contractName +
    //     ': ' +
    //     output.contracts['Inbox.sol'][contractName].evm.bytecode.object
    // );
    bytecode = output.contracts['Inbox.sol'][contractName].evm.bytecode.object;

    // console.log(
    //     contractName +
    //       ': ' +
    //       JSON.stringify(output.contracts['Inbox.sol'][contractName].abi)
    //   );
    interface = JSON.stringify(output.contracts['Inbox.sol'][contractName].abi);
  }

  module.exports = {
    bytecode:bytecode,
    interface:interface 
  }