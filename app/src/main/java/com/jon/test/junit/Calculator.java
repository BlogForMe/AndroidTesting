package com.jon.test.junit;

/**
 * Created by jon on 1/22/18.
 */

public class Calculator {
    public static int add(int one, int another) {
        return one + another;
    }

    public int multiply(int one, int another) {
        return one * another;
    }


    public double divide(double divident, double dividor) {
        if (dividor == 0) throw new IllegalArgumentException("Dividor cannot be  0");
        return divident / dividor;
    }

}
