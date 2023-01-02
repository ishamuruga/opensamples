const path = require("path");
const fs = require("fs");
const solc = require("solc");


const inboxSolName = path.resolve(__dirname,'contracts','Inbox.sol');

const source = fs.readFileSync(inboxSolName,'utf8');

module.exports = solc.compile(source,1).contracts[':Inbox'];

