package de.telran.homework.seven;

public class ReverseText {

    public String getReversedString(String text) {

        StringBuilder result = new StringBuilder();

        for (int i = (text.length() - 1); i >= 0; i--) {
            result.append(text.charAt(i));
        }
        return result.toString();
    }
}
