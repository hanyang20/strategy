package com.java.hy.strategy.util.strategy;

import java.util.ArrayList;
import java.util.List;

public class Bill {

    private List<Item> list = new ArrayList<>();

    public void addItem(Item item){
        list.add(item);
    }
    public void removeItem(Item item){
        list.remove(item);
    }
    public int sumCents(){
        return list.stream().mapToInt(item->item.getCents()).sum();
    }

    public void pay(PayMethod payMethod){
        payMethod.pay(sumCents());
    }
}
