package com.java.hy.strategy.util.cglib;

import util.BoyPerson;
import util.Person;

public class CglibProxyTest {

    public static void main(String[] args) {
        BoyPerson person = new BoyPerson();

        CglibProxy proxy = new CglibProxy(person);
        Person bind = (Person) proxy.bind();
        bind.findLove();
    }
}
