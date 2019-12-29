package com.java.hy.strategy.util.jdk;

import util.BoyPerson;
import util.Person;

public class JdkProxyTest {

    public static void main(String[] args) {
        BoyPerson person = new BoyPerson();
        JdkProxy jdkProxy = new JdkProxy(person);
        Person bind = (Person) jdkProxy.bind();
        bind.findLove();

    }
}
