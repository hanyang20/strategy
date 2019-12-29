package com.java.hy.strategy.util.strategy;

public class PayMethodFactory {


    public static PayMethod getInstance(String type){
        switch (type){
            case "credit":
                return new CreditCard();
            case "dedit" :
                return new DeditCard();
                default:return new CreditCard();
        }
    }
}
