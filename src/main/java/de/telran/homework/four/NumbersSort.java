package de.telran.homework.four;

import java.util.Scanner;

public class NumbersSort {
    public static void main(String[] args) {

        Scanner ui = new Scanner(System.in);

        System.out.println("enter first digit: ");
        int x = ui.nextInt();
        System.out.println("enter second digit: ");
        int y = ui.nextInt();
        System.out.println("enter third digit: ");
        int z = ui.nextInt();

        int firstDigit = Math.min(x, y);
        int secondDigit = Math.max(x, y);
        if (z < firstDigit) {
            System.out.println(z + ", " + firstDigit + ", " + secondDigit);
        } else if (z > secondDigit) {
            System.out.println(firstDigit + ", " + secondDigit + ", " + z);
        } else {
            System.out.println(firstDigit + ", " + z + ", " + secondDigit);
        }

        }
    }
