// SPDX-License-Identifier: MIT
pragma solidity ^0.8.17;

contract Lottery {

    address public manager;
    address[] public players;

    uint[] public ages;

    constructor() {
      ages.push(11);
      ages.push(22);
      ages.push(33);
      manager = msg.sender;  
    }

    function enter() public payable {
      require(msg.value>0.01 ether,"InSufficient Value");
      players.push(msg.sender);
    }

    function getAgesElements(uint id) public view returns(uint) {
      return ages[id];
    }

    function getBalance() public view returns(uint256) {
      return address(this).balance;
    }

    function sendMoney() public payable {
      ages.push(msg.value);
    }

    function random() private view returns (uint) {
      return uint(keccak256(abi.encodePacked(block.difficulty,block.timestamp,players)));
    }

    function pickWinner() public onlyManager {
      //require(msg.sender == manager,"Not a Manager Role");
      uint index = random() % players.length;
      payable(players[index]).transfer(address(this).balance);
      players = new address[](0);
    }

    modifier onlyManager() {
      require(msg.sender == manager,"Not a Manager Role");
      _;
    }

    function getPlayers() public view returns(address[] memory){
      return players;
    }
}