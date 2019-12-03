package com.company;

import java.util.Random;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        int length = 60;
        System.out.println(generatePsd(length));

    }

    public static char[] generatePsd(int len) {
        System.out.println("Ваша последовательность: ");
        String nums = "0123456789";
        String psSymbols = nums;
        Random rnd = new Random();
        char[] ps = new char[len];

        for (int i = 0; i < len; i++) {
            ps[i] = psSymbols.charAt(rnd.nextInt(psSymbols.length()));
        }
        return ps;

    }


}
