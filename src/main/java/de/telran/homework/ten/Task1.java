package de.telran.homework.ten;

import java.util.Arrays;

//Напишите программу, которая меняет местами элементы одномерного массива из String в обратном порядке.
//Не используйте дополнительный массив для хранения результатов.

public class Task1 {
    public static void main(String[] args) {
        String[] myArr = {"aaa","bbb", "ccc", "ddd", "eee"};
        System.out.println(Arrays.toString(myArr));
        reverseStrArr(myArr);
        System.out.println(Arrays.toString(myArr));
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
