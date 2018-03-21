package com.gupaoedu.vip.pattern.lumor.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class SurfingProxy implements InvocationHandler{

    private Surfing object;

    public Object getInstance(Surfing object){
        this.object = object;
        Class<?> clazz = object.getClass();
        return Proxy.newProxyInstance(clazz.getClassLoader(),clazz.getInterfaces(),this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("before.........");
        method.invoke(this.object,args);
        System.out.println("after.........");
        return null;
    }
}
