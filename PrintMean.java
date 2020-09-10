package com.company;
import java.util.Scanner;

public class PrintMean {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter 4 values you wanna calculate the means of");
        System.out.print("Value 1: ");
        double input1 = input.nextInt();
        System.out.print("Value 2: ");
        double input2 = input.nextInt();
        System.out.print("Value 3: ");
        double input3 = input.nextInt();
        System.out.print("Value 4: ");
        double input4 = input.nextInt();
        System.out.print("Mean of those 4 values is: " + MC(input1, input2, input3, input4));
    }

    public static String MC(double a, double b, double c, double d) {
        double s = (a + b + c + d) / 4.0;
        String Ms = Double.toString(s);

        return Ms;
    }
}
