package de.telran.homework.seven;

import java.util.Scanner;

public class UserData {

    Scanner scanner = new Scanner(System.in);
    public String getUserText() {
        System.out.print("Please enter your text: ");
        return scanner.nextLine();
    }
}
