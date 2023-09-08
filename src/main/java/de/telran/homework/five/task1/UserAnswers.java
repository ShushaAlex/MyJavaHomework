package de.telran.homework.five.task1;

import java.util.Scanner;

public class UserAnswers {

    Scanner userInput = new Scanner(System.in);

    public boolean isRainy() {
        System.out.print("Is it rainy outside? ");
        String answer = userInput.next();
        if (answer.equals("no")) {
            return false;
        } else {
            return true;
        }
    }

    public boolean isWeekend() {
        System.out.print("Is it weekend now? ");
        String answer = userInput.next();
        if (answer.equals("no")) {
            return false;
        } else {
            return true;
        }
    }
}
