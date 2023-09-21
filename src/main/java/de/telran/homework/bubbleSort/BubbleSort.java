package de.telran.homework.bubbleSort;

public class BubbleSort {

    public int[] sortIncrease(int[] array) {
        int stepsCount = array.length - 1;
        boolean swaped;
        do {
            swaped = false;
            for (int i = 0; i < stepsCount; i++) {
                if (array[i] > array[i +1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    swaped = true;
                }
            }
            stepsCount--;
        } while (swaped);
        return array;
    }

    public int[] sortDecrease(int[] array) {
        int stepsCount = array.length - 1;
        boolean swapped;

        do {
            swapped = false;

            for (int i = 0; i < stepsCount; i++) {
                if (array[i] < array[i + 1]) {
                    int tmp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = tmp;

                    swapped = true;
                }
            }
            stepsCount--;

        } while (swapped);

        return array;
    }
}
