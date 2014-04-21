package com.babyduncan.proxy.dynamicProxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * User: guohaozhao (guohaozhao116008@sohu-inc.com)
 * Date: 4/21/14 17:48
 */
public class BookServiceFacade implements InvocationHandler {

    private Object target;

    /**
     * @param target
     * @return
     */
    public Object bind(Object target) {
        this.target = target;
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = null;
        System.out.println("start");
        result = method.invoke(target, args);
        System.out.println("end");
        return result;
    }
}
