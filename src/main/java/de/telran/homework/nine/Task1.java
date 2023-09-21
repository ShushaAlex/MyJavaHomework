package de.telran.homework.nine;

import java.util.Arrays;
import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] intArray = new int[8];

        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = random.nextInt(51);
        }
        System.out.println(Arrays.toString(intArray));

        for (int i = 0; i < intArray.length; i++) {
            if (i % 2 != 0) {
                intArray[i] = 0;
            }
        }
        System.out.println(Arrays.toString(intArray));

    }
}


/*
Создайте массив из 8 случайных целых чисел из интервала [1;50]

Выведите массив на консоль в строку.

Замените каждый элемент с нечетным индексом на ноль.

Снова выведете массив на консоль в отдельной строке.
 */