package com.Bridge;

public class Bonus extends Card{
    public Bonus(Auth creditCheck, Auth userCheck){
        super(creditCheck, userCheck);
    }

    @Override
    public void createCard(){
        System.out.println("\nBonus ");
        creditCheck.process();
        userCheck.process();
    }
}
