package util;

import java.util.Scanner;

public class Calculator {

    public static double calculate() {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter first number");
        double a = scn.nextInt();
        System.out.println("Enter second number");
        double b = scn.nextInt();
        System.out.println("Enter operation. 1+ 2- 3* 4/");
        int operation = scn.nextInt();
        double result = 0;
        switch (operation) {
            case 1 ->
                result = MathUtil.topla(a, b);
            case 2 ->
                result = MathUtil.cix(a, b);
            case 3 ->
                result = MathUtil.vur(a, b);
            case 4 ->
                result = MathUtil.bol(a, b);
            default ->
                System.out.println("Incorrect operation");
        }
        return result;
    }

}
