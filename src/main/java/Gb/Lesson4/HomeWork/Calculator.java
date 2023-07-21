package Gb.Lesson4.HomeWork;

import java.util.List;

public class Calculator<E> {

    /**
     * @param numbers массив чисел
     * @return сумма всех элементов массива
     * @apiNote Написать класс калькулятор, принимающий List целочисленных значений,
     * возвращающий сумму элементов коллекции (метод sum)
     */
    public Double sum(List<? extends Number> numbers) {
        Double res = 0.0;
        for (Number number : numbers) {
            res += number.doubleValue();
        }
        return res;
    }

    /**
     * @param numbers массив чисел
     * @return Произведение всех элементов массива
     * @apiNote Расширить калькулятор (метод multi)
     */
    public Double multi(List<? extends Number> numbers) {
        Double res = 1.0;
        for (Number number : numbers) {
            res *= number.doubleValue();
        }
        return res;
    }

    /**
     * @param numbers массив чисел
     * @return Деление всех элементов массива
     * @apiNote Расширить калькулятор (метод div)
     */
    public Double div(List<? extends Number> numbers) {
        Double res = numbers.get(0).doubleValue();
        for (int i = 1; i < numbers.size(); i++) {
            res /= numbers.get(i).doubleValue();
        }
        return res;
    }

    /**
     * @param number Входящее число
     * @return Перевод входящего число в двоичную систему счисления
     * @apiNote Расширить калькулятор (бинарный перевод)
     */
    public StringBuilder binary(E number) {
        StringBuilder binary = new StringBuilder();
        if (number instanceof Integer) {
            binary.append(Integer.toBinaryString((Integer) number));
        } else if (number instanceof String) {
            binary.append(Integer.toBinaryString((Integer.parseInt(((String) number)))));
        } else if (number instanceof Double) {
            Integer left = ((Double) number).intValue();
            binary.append(Integer.toBinaryString(left) + ".");
            String num = String.valueOf(number).replace(".", "");
            Integer right = Integer.valueOf(num);
            Integer afterDot = num.length() - left.toString().length();
            Double pow = Math.pow(10, afterDot);
            right = right - left * pow.intValue();
            for (int i = 0; i < 16; i++) {
                right *= 2;
                if (right == pow.intValue()) {
                    binary.append(1);
                    break;
                } else if (right < pow.intValue()) {
                    binary.append(0);
                } else if (right > pow.intValue()) {
                    binary.append(1);
                    right -= pow.intValue();
                }
            }
        } else if (number instanceof Float) {
            Integer left = ((Float) number).intValue();
            binary.append(Integer.toBinaryString(left) + ".");
            String num = String.valueOf(number).replace(".", "");
            Integer right = Integer.valueOf(num);
            Integer afterDot = num.length() - left.toString().length();
            Double pow = Math.pow(10, afterDot);
            right = right - left * pow.intValue();
            for (int i = 0; i < 7; i++) {
                right *= 2;
                if (right == pow.intValue()) {
                    binary.append(1);
                    break;
                } else if (right < pow.intValue()) {
                    binary.append(0);
                } else if (right > pow.intValue()) {
                    binary.append(1);
                    right -= pow.intValue();
                }
            }
        }
        return binary;
    }
}
