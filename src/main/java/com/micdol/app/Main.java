package com.micdol.app;

import com.micdol.utils.Looper;

public class Main {
    public static void main(String[] args) {
        System.out.println("test");

        final Looper looper = new Looper();
        looper.max = 18;
        looper.loop();
    }
}
