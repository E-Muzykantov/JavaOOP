package Gb.Lesson6.HomeWork.Model;

public class RationalNumbers {
    protected Number number1;
    protected Number number2;


    public RationalNumbers(Number number1, Number number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    public RationalNumbers() {
    }

    public Number getNumber1() {
        return number1;
    }

    public void setNumber1(Number number1) {
        this.number1 = number1;
    }

    public Number getNumber2() {
        return number2;
    }

    public void setNumber2(Number number2) {
        this.number2 = number2;
    }
}
