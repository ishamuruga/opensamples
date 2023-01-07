const HDWalletProvider = require('@truffle/hdwallet-provider');
const Web3 = require("web3");
const {interface,bytecode} = require('./compile');

const provider = new HDWalletProvider(
    'entry refuse diagram gun advance matter auction infant just cram stairs shoe',
    'https://arbitrum-goerli.infura.io/v3/35f895974c4945fe902f704f1d33761c'
);

const web3= new Web3(provider);

const deploy = async () => {
    const accounts = await web3.eth.getAccounts();

    console.log("Attempting to deploy using Account..." + accounts[0]);

    const result = await new web3.eth.Contract(JSON.parse(interface))
        .deploy({data:bytecode,arguments:['SuperStar!']})
        .send({gas:'1000000',from:accounts[0]})

    console.log("Contract deployed to..",result.options.address);

    provider.engine.stop();
};

deploy();