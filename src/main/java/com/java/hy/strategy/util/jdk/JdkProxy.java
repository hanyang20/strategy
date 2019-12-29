package com.java.hy.strategy.util.jdk;



import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JdkProxy implements InvocationHandler {

    private Object target;

    public JdkProxy(Object target) {
        this.target = target;
    }

    public Object bind(){
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),target.getClass().getInterfaces(), this);
    }



    @Override
    public Object invoke(Object proxy, Method method, Object[] objects) throws Throwable {
        before();
        System.out.println("");
        Object invoke = method.invoke(target, objects);
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
