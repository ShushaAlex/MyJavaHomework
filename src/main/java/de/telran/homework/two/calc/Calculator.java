package de.telran.homework.two.calc;

public class Calculator {

    double x;
    double y;

    public Calculator(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double sum() {
        return x + y;
    }

    public double sub() {
        return x - y;
    }

    public double mult() {
        return x * y;
    }

    public double div() {
        return x / y;
    }
}
