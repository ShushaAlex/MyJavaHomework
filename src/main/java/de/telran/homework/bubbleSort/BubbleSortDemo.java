package de.telran.homework.bubbleSort;

import java.util.Arrays;

public class BubbleSortDemo {
    public static void main(String[] args) {
        BubbleSort sort = new BubbleSort();
        int[] intArray = {1, 4, 33, 7, 2, 10, 2, 4};

        int[] sortedArr = sort.sortIncrease(intArray);
        System.out.println(Arrays.toString(sortedArr));

        int[] sortedArr2 = sort.sortDecrease(intArray);
        System.out.println(Arrays.toString(sortedArr2));
    }
}
