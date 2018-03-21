package com.gupaoedu.vip.pattern.lumor.staticed;

public class SayHelloProxy implements SayHello {

    private SayHello sayHello;

    SayHelloProxy(SayHello object) {
        sayHello = object;
    }

    @Override
    public String sayHello() {

        System.out.println("before............");
        sayHello.sayHello();
        System.out.println("after.............");
        return null;
    }
}
