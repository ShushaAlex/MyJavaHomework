package de.telran.homework.two.calc;

public class MyCalculator {
    public static void main(String[] args) {

        Calculator myCalc = new Calculator();

        System.out.println(myCalc.sum(10, 13));
        System.out.println(myCalc.sub(27, 6));
        System.out.println(myCalc.mult(9, 19));
        System.out.println(myCalc.div(76, 14));
    }
}
