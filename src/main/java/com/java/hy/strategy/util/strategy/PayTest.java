package com.java.hy.strategy.util.strategy;

public class PayTest {

    public static void main(String[] args) {
        Bill bill = new Bill();
        bill.addItem(new Item("JVM书籍",10000));
        bill.addItem(new Item("spring书籍",5000));

        bill.pay(PayMethodFactory.getInstance("dedit"));
    }
}
