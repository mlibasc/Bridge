package com.Bridge;

abstract class Card {
    protected Auth creditCheck;
    protected Auth userCheck;

    protected Card(Auth creditCheck, Auth userCheck){
        this.creditCheck = creditCheck;
        this.userCheck = userCheck;
    }
    abstract public void createCard();
}
