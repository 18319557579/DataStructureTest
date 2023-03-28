package com.hsf.datastructuretest.util;

import java.util.Random;

public class NumberUtils {
    public static int getRandomNumber() {
        Random random = new Random();
        return random.nextInt(10000);
    }
}
