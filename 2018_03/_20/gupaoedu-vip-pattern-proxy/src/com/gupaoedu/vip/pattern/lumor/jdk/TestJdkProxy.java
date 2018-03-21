package com.gupaoedu.vip.pattern.lumor.jdk;

public class TestJdkProxy {

    public static void main(String[] args) {

        Surfing proxy = (Surfing) new SurfingProxy().getInstance(new SurfingWWW());
        proxy.canScanWeb();
    }
}
