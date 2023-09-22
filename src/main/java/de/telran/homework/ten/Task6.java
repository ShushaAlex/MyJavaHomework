package de.telran.homework.ten;

import java.util.Scanner;

// Напишите программу, которая определит, сколько слов Вы ввели с консоли.
public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your string: ");
        String inputString = scanner.nextLine();
        String[] stringArr = inputString.split(" ");
        System.out.println("You entered " + stringArr.length + " words.");
    }
}