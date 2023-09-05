package de.telran.homework.three.stringConstructorApp.service;

public class HalfSubstring {

    public String cutFirstHalfString (String word) {
        int indexOfHalfString = word.length() / 2;
        return word.substring(0, indexOfHalfString);
    }

    public String cutSecondHalfString (String word) {
        int indexOfHalfString = word.length() / 2;
        return word.substring(indexOfHalfString);
    }
}
