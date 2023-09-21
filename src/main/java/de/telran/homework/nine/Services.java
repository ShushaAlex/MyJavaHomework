package de.telran.homework.nine;

public class Services {
    public int getRandomInt(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }

    public boolean isIncreasingSequence(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                return false;
            }
        }
        return true;
    }
}
