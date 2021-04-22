package com.Bridge;

import javax.naming.AuthenticationException;

public class GiftCard extends Card{
    public GiftCard(Auth creditCheck, Auth userCheck){
        super(creditCheck, userCheck);
    }

    @Override
    public void createCard(){
        System.out.println("\nGift Card ");
        creditCheck.process();
        userCheck.process();
    }
}
