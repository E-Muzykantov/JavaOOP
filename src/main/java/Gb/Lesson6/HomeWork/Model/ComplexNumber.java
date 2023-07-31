package Gb.Lesson6.HomeWork.Model;

public class ComplexNumber implements ComplexCalculator {
    private Number real;
    private Number imaginary;
    ComplexNumber complexNumber;

    public ComplexNumber(Number real, Number imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public ComplexNumber() {
    }

    public Number getReal() {
        return real;
    }

    public void setReal(Number real) {
        this.real = real;
    }

    public Number getImaginary() {
        return imaginary;
    }

    public void setImaginary(Number imaginary) {
        this.imaginary = imaginary;
    }

    @Override
    public ComplexNumber sum(ComplexNumber complex) {
        Number newReal = complex.getReal();
        complexNumber = new ComplexNumber(real.intValue() + complex.getReal().intValue(),
                imaginary.intValue() + complex.getImaginary().intValue());
        return complexNumber;
    }

    @Override
    public ComplexNumber diff(ComplexNumber complex) {
        complexNumber = new ComplexNumber(real.intValue() - complex.getReal().intValue(),
                imaginary.intValue() - complex.getImaginary().intValue());
        return complexNumber;
    }

    @Override
    public ComplexNumber multi(ComplexNumber complex) {
        Number newReal = (real.intValue() * complex.getReal().intValue()) -
                (imaginary.intValue() * complex.getImaginary().intValue());
        Number newImaginary = (imaginary.intValue() * complex.getReal().intValue()) +
                (real.intValue() * complex.getImaginary().intValue());
        complexNumber = new ComplexNumber(newReal, newImaginary);
        return complexNumber;
    }

    @Override
    public ComplexNumber div(ComplexNumber complex) {
        Number newReal = ((real.doubleValue() * complex.getReal().doubleValue()) +
                (imaginary.doubleValue() * complex.getImaginary().doubleValue())) /
                ((complex.getReal().doubleValue() * complex.getReal().doubleValue()) +
                (complex.getImaginary().doubleValue() * complex.getImaginary().doubleValue()));
        Number newImaginary = ((imaginary.doubleValue() * complex.getReal().doubleValue()) -
                (real.doubleValue() * complex.getImaginary().doubleValue())) /
                ((complex.getReal().doubleValue() * complex.getReal().doubleValue()) +
                (complex.getImaginary().doubleValue() * complex.getImaginary().doubleValue()));
        complexNumber = new ComplexNumber(newReal, newImaginary);
        return complexNumber;
    }

    public String checkImaginary() {
        if (imaginary.doubleValue() >= 0) return "+";
        return "";
    }

    public String toString() {
        return "" + real + "" + checkImaginary() + "" + imaginary + "i";
    }


}
