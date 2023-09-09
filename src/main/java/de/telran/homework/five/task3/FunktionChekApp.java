package de.telran.homework.five.task3;

import java.util.Scanner;

public class FunktionChekApp {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        WorkConditions correctCheck = new WorkConditions();

        System.out.print("Enter temperature of the first flask: ");
        int firstFlaskTemp = userInput.nextInt();

        System.out.print("Enter temperature of the second flask: ");
        int secondFlaskTemp = userInput.nextInt();

        System.out.print("Your device is working correctly? " +
                correctCheck.isWorkingCorrect(firstFlaskTemp, secondFlaskTemp));
    }
}
