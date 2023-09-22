package de.telran.homework.ten;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
//Пользователь должен ввести с клавиатуры размер массива - натуральное число больше 3.
// Введенное пользователем число сохраняется в переменную n.
// Если пользователь ввёл не подходящее число, то программа должна просить пользователя повторить ввод.
// Создать массив из n случайных целых чисел из отрезка [0;n] и вывести его на экран.
// Создать второй массив только из чётных элементов первого массива, если они там есть, и вывести его на экран.
public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int n;

        do {
            System.out.print("введите количество чисел в массиве: ");
            n = scanner.nextInt();
        } while (n < 3);

        int[] intArray = new int[n];
        for (int i = 0; i < n; i++) {
            intArray[i] = random.nextInt(n);
        }
        System.out.println(Arrays.toString(intArray));

        int evenArrCount = 0;
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] % 2 == 0) {
                evenArrCount++;
            }
        }

        if (evenArrCount == 0) {
            System.out.println("There's no even numbers in massive");
        } else {
            int[] evenNumsOnly = new int[evenArrCount];
            int evenArrIndex = 0;

            for (int i = 0; i < intArray.length; i++) {
                if (intArray[i] % 2 == 0) {
                    evenNumsOnly[evenArrIndex] = intArray[i];
                    evenArrIndex ++;
                }
            }
            System.out.println(Arrays.toString(evenNumsOnly));
        }
    }
}
