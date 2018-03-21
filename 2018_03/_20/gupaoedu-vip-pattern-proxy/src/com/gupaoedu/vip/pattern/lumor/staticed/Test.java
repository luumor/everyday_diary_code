package com.gupaoedu.vip.pattern.lumor.staticed;

public class Test {

    public static void main(String[] args) {
        SayHelloProxy proxy = new SayHelloProxy(new SayHelloImpl());
        proxy.sayHello();

    }

}
