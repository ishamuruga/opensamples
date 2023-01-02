pragma solidity ^0.8.6;

contract Inbox {

    string public message;

    constructor(string memory _initialMessage){
        message =_initialMessage;
    }

    function setMessage(string memory newMessage) public {
        message = newMessage;
    }

    function getMessage() public view returns(string memory) {
        return message;
    }
}