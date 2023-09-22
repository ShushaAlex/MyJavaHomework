package de.telran.homework.ten;

import java.util.Arrays;
import java.util.Scanner;

//Напишите программу, которая меняет местами элементы одномерного массива из String в обратном порядке.
//Не используйте дополнительный массив для хранения результатов.

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your string: ");
        String inputString = scanner.nextLine();
        String[] stringArr = inputString.split(" ");
        System.out.println(Arrays.toString(stringArr));
        reverseStrArr(stringArr);
        System.out.println(Arrays.toString(stringArr));
    }
    public static void reverseStrArr(String[] arr) {
        int lastChar = arr.length - 1;
        for (int i = 0; i < arr.length / 2; i++) {
            String tmp = arr[i];
            arr[i] = arr[lastChar];
            arr[lastChar] = tmp;
            lastChar -= 1;
        }
    }

}
