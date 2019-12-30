package com.java.hy.strategy.util.cglib;



import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;


public class CglibProxy implements MethodInterceptor {
    private Object targrt;

    public CglibProxy(Object targrt) {
        this.targrt = targrt;

    }

    public Object bind(){
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(targrt.getClass());
        enhancer.setCallback(this);
        Object o = enhancer.create();
        return o;
    }


    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        before();
        Object invoke = methodProxy.invokeSuper(o,objects);
        after();
        return invoke;
    }

    private void after() {

        System.out.println("物色对象结束");
    }

    private void before() {
        System.out.println("已经了解你的需求,开始物色对象");
    }
}
