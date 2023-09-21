package de.telran.homework.nine;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {

        Services services = new Services();
        int[] intArray = new int[5];

        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = services.getRandomInt(10, 99);
        }
        System.out.println(Arrays.toString(intArray));

        if (services.isIncreasingSequence(intArray)) {
            System.out.println("массив является строго возрастающей последовательностью");
        } else {
            System.out.println("массив НЕ является строго возрастающей последовательностью");
        }

    }
}

/*
1. Создайте массив из 5 случайных целых чисел из интервала [10;99]
2. Выведите его на консоль в строку.
3. Определите и выведите на экран сообщение о том, является ли
массив строго возрастающей последовательностью.

Я также написала тесты для проверки метода isIncreasingSequence,
так как при создании массива из рандомных чисел маловероятно,
что попадется возрастающая последовательность.
 */