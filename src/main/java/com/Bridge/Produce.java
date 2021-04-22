package com.Bridge;

public class Produce implements Auth{
    @Override
    public void process(){
        System.out.println("Authenticated...");
    }
}
