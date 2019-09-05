package com.micdol.utils;

import java.util.Arrays;

public class Looper {

    public int max;

    public void loop() {
        for (int i = 0; i < max; i++) {
            String message = String.format("Looping... %.2f%%", 100.0 * (i + 1) / max);
            System.out.println(message);
        }


        Arrays.stream(new int[]{1, 2, 4, 5, 6, 7})
                .map(e -> e * e)
                .mapToObj(e -> e + " ")
                .forEach(System.out::print);
    }
}
