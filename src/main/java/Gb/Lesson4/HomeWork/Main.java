package Gb.Lesson4.HomeWork;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        List<Double> doubleList = new ArrayList<>();
        for (int i = 3; i <= 10; i += 2) {
            doubleList.add((double) i);

        }
        System.out.println("calc.sum(doubleList) = " + calc.sum(doubleList));
        System.out.println("calc.div(doubleList) = " + calc.div(doubleList));
        System.out.println("calc.multi(doubleList) = " + calc.multi(doubleList));

        Double num1 = 21.125;
        Float num2 = 2.050f;
        String num3 = "67";
        int num4 = 7;
        System.out.println("calc.binary(num1) = " + calc.binary(num1));
        System.out.println("calc.binary(num2) = " + calc.binary(num2));
        System.out.println("calc.binary(num3) = " + calc.binary(num3));
        System.out.println("calc.binary(num4) = " + calc.binary(num4));
    }
}

