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
}