package de.telran.homework.three.myNewCalculator.userInterface;

import java.util.Scanner;

public class UserInput {
        public double userInputDouble(){
            Scanner scanner = new Scanner(System.in);
            return scanner.nextDouble();
        }
}
