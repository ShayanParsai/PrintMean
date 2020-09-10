package com.company;

public class PrintMean {

    public static void main(String[] args) {
        System.out.println("Mean of 1, 1, 3, 3: " + MC(1,1,3,3));
        System.out.println("Mean of 1, 2, 3, 4: " + MC(1,2,3,4));
        System.out.println("Mean of 1, -2, 3, -4: " + MC(1,-2,3,-4));
        System.out.println("Mean of -1, -11, 24, 2: " + MC(-1,-11,24,2));
    }

    public static String MC(double a, double b, double c, double d) {
        double s = (a + b + c + d) / 4.0;
        String Ms = Double.toString(s);

        return Ms;
    }
}