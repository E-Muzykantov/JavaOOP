package Gb.Lesson7.HomeWork.Model;

public class Decimals extends RationalNumbers implements RationalCalculator {
    public Decimals(Number number1, Number number2) {
        super(number1, number2);
    }

    public Decimals() {
    }

    @Override
    public Double sum(Number number1, Number number2) {
        Double result = 0.0;
        result = number1.doubleValue() + number2.doubleValue();
        return Math.ceil(result * 1000) / 1000;
    }

    @Override
    public Double diff(Number number1, Number number2) {
        Double result = 0.0;
        result = number1.doubleValue() - number2.doubleValue();
        return Math.ceil(result * 1000) / 1000;
    }

    @Override
    public Double div(Number number1, Number number2) {
        Double result = 0.0;
        result = number1.doubleValue() / number2.doubleValue();
        return Math.ceil(result * 1000) / 1000;
    }

    @Override
    public Double multi(Number number1, Number number2) {
        Double result = 0.0;
        result = number1.doubleValue() * number2.doubleValue();
        return Math.ceil(result * 1000) / 1000;
    }
}