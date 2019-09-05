package com.micdol.utils;

public class Looper {

    public int max;

    public void loop() {
        for (int i = 0; i < max; i++) {
            String message = String.format("Looping... %.2f%%", 100.0 * (i + 1) / max);
            System.out.println(message);
        }
    }
}
