package com.java.hy.strategy.util.strategy;

import javax.annotation.PostConstruct;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public abstract class Card implements PayMethod{

    private Map<String, PayMethod> map = new ConcurrentHashMap<>();

    @PostConstruct
    public void init() {
        map.put(getType(), this);
    }

    @Override
    public void pay(int cents) {
        System.out.println("use->" + getType() + ", cents->"+cents);
        executeTransaction(cents);//执行支付操作
    }

    public abstract String getType();
    public abstract void executeTransaction(int cents);

}
