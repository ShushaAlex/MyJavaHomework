package de.telran.homework.seven;

public class ReverseTextDemo {
    public static void main(String[] args) {
        ReverseText reverse = new ReverseText();
        UserData ui = new UserData();

        String userText = ui.getUserText();

        while (!userText.isEmpty()) {
            System.out.println(reverse.getReversedString(userText));
            userText = ui.getUserText();
        }
    }
}
