package Gb.Lesson6.HomeWork.View;

import java.lang.invoke.VarHandle;
import java.util.Scanner;


public class View {
    private Scanner scanner;

    public View() {
        scanner = new Scanner(System.in);
    }

    public void calculatorMenu() {
        System.out.println("--- Меню калькулятора ---\n" +
                "1. Рациональные числа\n" +
                "2. Комплексные числа\n" +
                "3. Бинарный перевод\n" +
                "0. Выход\n" +
                "Введите число: ");
    }

    public int getMenuChoice() {
        return scanner.nextInt();
    }

    public void rationalMenu() {
        System.out.println("--- Меню рациональных чисел ---\n" +
                "1. Сложение\n" +
                "2. Вычитание\n" +
                "3. Умножение\n" +
                "4. Деление\n" +
                "0. Вернуться в меню калькулятора\n" +
                "Введите число: ");
    }

    public void complexMenu() {
        System.out.println("--- Меню комплексных чисел ---\n" +
                "1. Сложение\n" +
                "2. Вычитание\n" +
                "3. Умножение\n" +
                "4. Деление\n" +
                "0. Вернуться в меню калькулятора\n" +
                "Введите число: ");
    }

    public void result(String result) {
        System.out.println("Получилось: " + result);
    }

    public void exit() {
        System.out.println("Выход...");
    }

    public void incorrectInput() {
        System.out.println("Неправильный ввод! Повторите попытку: ");
    }

    public String enter() {
        return scanner.nextLine();
    }
}


