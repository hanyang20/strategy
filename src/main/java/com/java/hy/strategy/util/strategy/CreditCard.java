package com.java.hy.strategy.util.strategy;

public class CreditCard extends Card {
    @Override
    public String getType() {
        return "credit";
    }

    @Override
    public void executeTransaction(int cents) {
        System.out.println("doTransaction credit"+cents);
    }
}
