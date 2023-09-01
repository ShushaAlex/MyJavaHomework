package de.telran.homework.two.calc;

public class MyCalculator {
    public static void main(String[] args) {

        Calculator myCalc = new Calculator(46, 25);

        System.out.println(myCalc.sum());
        System.out.println(myCalc.sub());
        System.out.println(myCalc.mult());
        System.out.println(myCalc.div());
    }
}
