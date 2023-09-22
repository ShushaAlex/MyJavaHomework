package de.telran.homework.ten;

public class Service {
    public int[] sortArray(int[] array) {
        boolean swapped;
        int stepsCount = array.length - 1;

        do {
            swapped = false;
            for (int i = 0; i < stepsCount; i++) {
                if (array[i] > array[i + 1]) {
                    int tmp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = tmp;
                    swapped = true;
                }
            }
            stepsCount --;
        } while (swapped);
        return array;
    }
    public int getLastIndexOfSearchElement(int[] array, int searchElement) {
        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] == searchElement) {
                return i;
            }
        }
        return -1;
    }

    public int getRandomInt(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }

    public int simpleAverage(int sum, int numCount) {
        return sum / numCount;
    }
}
