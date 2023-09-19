package de.telran.homework.six;

import java.util.Scanner;

public class UserData {

    int figureShape;
    int calculationType;
    double firstParam;
    double secondParam;
    double userAnswer;
    double correctAnswer;

    Scanner ui = new Scanner(System.in);


    void getFigureShape() {
        System.out.println("Enter number of the figure:");
        System.out.println("1 - circle");
        System.out.println("2 - square");
        System.out.println("3 - rectangle");
        figureShape = ui.nextInt();
        if ((figureShape <1) || (figureShape > 3)) {
            System.out.println("Answer is incorrect.");
            System.exit(1);
        }
    }

    void getFigureParams(int figureShape) {
        if (figureShape != 3) {
        System.out.print("Enter figure parameter: ");
        firstParam = ui.nextDouble();
        } else {
            System.out.print("Enter first figure parameter: ");
            firstParam = ui.nextDouble();
            System.out.print("Enter second figure parameter: ");
            secondParam = ui.nextDouble();
        }
    }

    void getCalculationType() {
        System.out.println("What do you want to calculate?");
        System.out.println("1 - area");
        System.out.println("2 - perimeter");
        calculationType = ui.nextInt();
    }

    void getUserAnswer(int typeOfCalc) {
        if (typeOfCalc == 1) {
            System.out.print("Enter figures area: ");
        } else {
            System.out.print("Enter figures perimeter: ");
        }
        userAnswer = ui.nextDouble();
    }

    boolean isAnswerRight(double userAnswer, double correctAnswer) {
        return (userAnswer == correctAnswer);
    }

}
