// SPDX-License-Identifier: MIT
pragma solidity ^0.8.17;

contract Lottery {

    address public manager;

    constructor() {
      manager = msg.sender;  
    }
}