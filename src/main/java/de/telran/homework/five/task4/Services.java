package de.telran.homework.five.task4;

public class Services {

    public int getRandomSeconds() {
        return (int) ((Math.random() * (28800 - 0)) + 0);
    }

    public int convertSecToHours(int seconds) {
        return seconds / (60 * 60);
    }
}

