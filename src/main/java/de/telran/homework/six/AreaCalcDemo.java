package de.telran.homework.six;

public class AreaCalcDemo {
    public static void main(String[] args) {
        UserData userData = new UserData();
        Formules formules = new Formules();

        userData.getFigureShape();
        userData.getCalculationType();
        userData.getFigureParams(userData.figureShape);
        userData.getUserAnswer(userData.calculationType);

        switch (userData.figureShape) {
            case 1: {
                if (userData.calculationType == 1){
                    userData.correctAnswer = formules.circleArea(userData.firstParam);
                } else {
                    userData.correctAnswer = formules.circlePerimeter(userData.firstParam);
                }
                break;
            }
            case 2: {
                if (userData.calculationType == 1){
                    userData.correctAnswer = formules.squareArea(userData.firstParam);
                } else {
                    userData.correctAnswer = formules.squarePerimeter(userData.firstParam);
                }
                break;
            }
            case 3: {
                if (userData.calculationType == 1) {
                    userData.correctAnswer = formules.rectangleArea(userData.firstParam, userData.secondParam);
                } else {
                    userData.correctAnswer = formules.rectanglePerimeter(userData.firstParam, userData.secondParam);
                }
                break;
            }
        }

        boolean answerCheck = userData.isAnswerRight(userData.correctAnswer, userData.userAnswer);

        if (answerCheck) {
            System.out.println("That's right!");
        } else {
            System.out.println("I'm sorry, your answer " + userData.userAnswer +
                    " is incorrect. Correct answer is: " + userData.correctAnswer);
        }
    }

}
