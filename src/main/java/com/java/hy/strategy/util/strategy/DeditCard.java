package com.java.hy.strategy.util.strategy;

public class DeditCard extends Card {
    @Override
    public String getType() {
        return "dedit";
    }

    @Override
    public void executeTransaction(int cents) {
        System.out.println("doTransaction dedit"+ cents);
    }
}
