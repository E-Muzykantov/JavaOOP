package Gb.Lesson6.HomeWork.Controller;

import Gb.Lesson6.HomeWork.Model.*;
import Gb.Lesson6.HomeWork.View.View;

public class CalculatorController {
    private View view = new View();
    private RationalNumbers rationalNumbers;
    private ComplexNumber complexNumber;
    private Integers integers;
    private Decimals decimals;
    private Binary binary;


    public void start() {
        boolean exit = false;
        while (!exit) {
            view.calculatorMenu();
            int choice = view.getMenuChoice();
            switch (choice) {
                case 1:
                    rationalNumbers= new RationalNumbers();
                    rational();
                    break;
                case 2:
                    complexNumber = new ComplexNumber();
                    complex();
                    break;
                case 3:
                    binary= new Binary();
                    System.out.println("Введите число которое хотите перевести в двоичную систему: ");
                    view.enter();
                    view.result(binary.conversion(view.enter()).toString());
                    break;
                case 0:
                    exit = true;
                    break;
                default:
                    view.incorrectInput();
                    break;
            }
        }
        view.exit();
    }


    private void rational() {
        boolean backToMenu = false;
        while (!backToMenu) {
            view.rationalMenu();
            int choice = view.getMenuChoice();
            switch (choice) {
                case 1:
                    rationalSum();
                    break;
                case 2:
                    rationalDiff();
                    break;
                case 3:
                    rationalMulti();
                    break;
                case 4:
                    rationalDiv();
                    break;
                case 0:
                    backToMenu = true;
                    break;
                default:
                    view.incorrectInput();
                    break;
            }
        }
    }


    private void complex() {
        boolean backToMenu = false;
        while (!backToMenu) {
            view.complexMenu();
            int choice = view.getMenuChoice();
            switch (choice) {
                case 1:
                    complexSum();
                    break;
                case 2:
                    complexDiff();
                    break;
                case 3:
                    complexMulti();
                    break;
                case 4:
                    complexDiv();
                    break;
                case 0:
                    backToMenu = true;
                    break;
                default:
                    view.incorrectInput();
                    break;
            }
        }
    }

    private void rationalSum() {
        System.out.println("Введите первое число: ");
        view.enter();
        String a = view.enter();
        System.out.println("Введите второе число: ");
        String b = view.enter();
        if (!a.matches("(-?\\d*\\.\\d*)") && !b.matches("(-?\\d*\\.\\d*)")) {
            integers = new Integers();
            Integer res = integers.sum(Integer.parseInt(a), Integer.parseInt(b));
            view.result(res.toString());
        } else {
            decimals = new Decimals();
            Double res = decimals.sum(Double.parseDouble(a), Double.parseDouble(b));
            view.result(res.toString());
        }
    }

    private void rationalDiff() {
        System.out.println("Введите первое число: ");
        view.enter();
        String a = view.enter();
        System.out.println("Введите второе число: ");
        String b = view.enter();
        if (!a.matches("(-?\\d*\\.\\d*)") && !b.matches("(-?\\d*\\.\\d*)")) {
            integers = new Integers();
            Integer res = integers.diff(Integer.parseInt(a), Integer.parseInt(b));
            view.result(res.toString());
        } else {
            decimals = new Decimals();
            Double res = decimals.diff(Double.parseDouble(a), Double.parseDouble(b));
            view.result(res.toString());
        }
    }

    private void rationalDiv() {
        System.out.println("Введите первое число: ");
        view.enter();
        String a = view.enter();
        System.out.println("Введите второе число: ");
        String b = view.enter();
        if (b.matches("((0)(\\.?0*?))")) {
            System.out.println("Деление на 0 невозможно! Повторите ввод: ");
            rational();
        } else if (!a.matches("(-?\\d*\\.\\d*)") && !b.matches("(-?\\d*\\.\\d*)")) {
            integers = new Integers();
            Number res = integers.div(Integer.parseInt(a), Integer.parseInt(b));
            view.result(res.toString());
        } else {
            decimals = new Decimals();
            Double res = decimals.div(Double.parseDouble(a), Double.parseDouble(b));
            view.result(res.toString());
        }
    }

    private void rationalMulti() {
        System.out.println("Введите первое число: ");
        view.enter();
        String a = view.enter();
        System.out.println("Введите второе число: ");
        String b = view.enter();
        if (!a.matches("(-?\\d*\\.\\d*)?") && !b.matches("(-?\\d*\\.\\d*)?")) {
            integers = new Integers();
            Integer res = integers.multi(Integer.parseInt(a), Integer.parseInt(b));
            view.result(res.toString());
        } else {
            decimals = new Decimals();
            Double res = decimals.multi(Double.parseDouble(a), Double.parseDouble(b));
            view.result(res.toString());
        }
    }

    private void complexSum() {
        System.out.println("Сумма комплексных чисел представлена в виде уравнения: \n(a + bi) + (c + di)\n");
        System.out.println("Введите число a: ");
        view.enter();
        Integer a = Integer.parseInt(view.enter());
        System.out.println("Введите число b: ");
        Integer b = Integer.parseInt(view.enter());
        ComplexNumber complex1 = new ComplexNumber(a, b);
        System.out.println("Введите число c:");
        a = Integer.parseInt(view.enter());
        System.out.println("Введите число d:");
        b = Integer.parseInt(view.enter());
        ComplexNumber complex2 = new ComplexNumber(a, b);
        complexNumber = complex1.sum(complex2);
        view.result(complexNumber.toString());
    }

    private void complexDiff() {
        System.out.println("Разность комплексных чисел представлена в виде уравнения: \n(a + bi) - (c + di)\n");
        System.out.println("Введите число a: ");
        view.enter();
        Integer a = Integer.parseInt(view.enter());
        System.out.println("Введите число b: ");
        Integer b = Integer.parseInt(view.enter());
        ComplexNumber complex1 = new ComplexNumber(a, b);
        System.out.println("Введите число c:");
        a = Integer.parseInt(view.enter());
        System.out.println("Введите число d:");
        b = Integer.parseInt(view.enter());
        ComplexNumber complex2 = new ComplexNumber(a, b);
        complexNumber = complex1.diff(complex2);
        view.result(complexNumber.toString());
    }

    private void complexMulti() {
        System.out.println("Умножение комплексных чисел представлено в виде уравнения: \n(a + bi) * (c + di)\n");
        System.out.println("Введите число a: ");
        view.enter();
        Integer a = Integer.parseInt(view.enter());
        System.out.println("Введите число b: ");
        Integer b = Integer.parseInt(view.enter());
        ComplexNumber complex1 = new ComplexNumber(a, b);
        System.out.println("Введите число c:");
        a = Integer.parseInt(view.enter());
        System.out.println("Введите число d:");
        b = Integer.parseInt(view.enter());
        ComplexNumber complex2 = new ComplexNumber(a, b);
        complexNumber = complex1.multi(complex2);
        view.result(complexNumber.toString());
    }

    private void complexDiv() {
        System.out.println("Деление комплексных чисел представлено в виде уравнения: \n(a + bi) / (c + di)\n");
        System.out.println("Введите число a: ");
        view.enter();
        Integer a = Integer.parseInt(view.enter());
        System.out.println("Введите число b: ");
        Integer b = Integer.parseInt(view.enter());
        ComplexNumber complex1 = new ComplexNumber(a, b);
        System.out.println("Введите число c:");
        a = Integer.parseInt(view.enter());
        System.out.println("Введите число d:");
        b = Integer.parseInt(view.enter());
        ComplexNumber complex2 = new ComplexNumber(a, b);
        complexNumber = complex1.div(complex2);
        view.result(complexNumber.toString());
    }
}


