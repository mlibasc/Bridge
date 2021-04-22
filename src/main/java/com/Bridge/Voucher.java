package com.Bridge;

public class Voucher extends Card{
    public Voucher(Auth creditCheck, Auth userCheck){
        super(creditCheck, userCheck);
    }

    @Override
    public void createCard(){
        System.out.println("\nVoucher");
        creditCheck.process();
        userCheck.process();
    }
}
