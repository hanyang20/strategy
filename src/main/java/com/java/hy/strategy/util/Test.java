package com.java.hy.strategy.util;

import java.lang.reflect.Field;

public class Test {

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
//        Integer a = 1,b =2;
//
//        System.out.println("before : a = " + a + ", b = " + b);
//
//        swap(a,b);
//
//        System.out.println("after : a = " + a + ", b = " + b);

                Integer a = 1,b =1;
        System.out.println(a.getClass());
        System.out.println(b.getClass());

    }

    private static void swap(Integer i1, Integer i2) throws NoSuchFieldException, IllegalAccessException {
        Field field = Integer.class.getDeclaredField("value");
        field.setAccessible(true);
//        int tmp = i1.intValue();
//
//        field.set(i1,i2.intValue());//Integer.valueof(i2).intvalue()
//        field.set(i2,tmp);//Integer.valueof(tmp).intvalue()

//        Integer tmp = new Integer(i1);
//
//        field.set(i1,i2.intValue());//Integer.valueof(i2).intvalue()
//        field.set(i2,tmp);//Integer.valueof(tmp).intvalue()

        int tmp = i1.intValue();
        tmp = Integer.valueOf(i2);
        field.setInt(i1,i2.intValue());//Integer.valueof(i2).intvalue()
        field.setInt(i2,tmp);//Integer.valueof(tmp).intvalue()
        System.out.println(tmp);
    }


}
