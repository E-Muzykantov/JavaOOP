package Gb.Lesson7.HomeWork.Model;

public class Integers extends RationalNumbers implements RationalCalculator {
    public Integers(Number number1, Number number2) {
        super(number1, number2);
    }

    public Integers() {
    }

    @Override
    public Integer sum(Number number1, Number number2) {
        Integer result = 0;
        result = number1.intValue() + number2.intValue();
        return result;
    }

    @Override
    public Integer diff(Number number1, Number number2) {
        Integer result = 0;
        result = number1.intValue() - number2.intValue();
        return result;
    }

    @Override
    public Number div(Number number1, Number number2) {
        Number result = 0;
        result = number1.intValue() / number2.intValue();
        return result;
    }

    @Override
    public Integer multi(Number number1, Number number2) {
        Integer result = 0;
        result = number1.intValue() * number2.intValue();
        return result;
    }
}
