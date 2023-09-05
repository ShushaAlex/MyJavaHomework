package de.telran.homework.three.myNewCalculator;

import de.telran.homework.three.myNewCalculator.userInterface.UserInput;
import de.telran.homework.three.myNewCalculator.userInterface.UserOutput;
import de.telran.homework.two.calc.Calculator;

public class CalculatorApp {
    public static void main(String[] args) {
        UserInput ui = new UserInput();
        UserOutput uo = new UserOutput();
        Calculator calc = new Calculator();

        System.out.print("введите первое число: ");
        double firstParam = ui.userInputDouble();

        System.out.print("введите второе число: ");
        double secondParam = ui.userInputDouble();

        uo.printData(
                "результат сложения " + firstParam + " и " + secondParam + " равен: ",
                calc.sum(firstParam, secondParam));

        uo.printData(
                "результат вычитания " + firstParam + " и " + secondParam + " равен: ",
                calc.sub(firstParam, secondParam));

        uo.printData(
                "результат умножения " + firstParam + " на " + secondParam + " равен: ",
                calc.mult(firstParam, secondParam));

        uo.printData(
                "результат деления " + firstParam + " на " + secondParam + " равен: ",
                calc.div(firstParam, secondParam));

    }
}
