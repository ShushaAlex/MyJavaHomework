package de.telran.homework.ten;

import java.util.Arrays;

/*
Создайте массив из 5 случайных целых чисел из интервала [10;99]
Выведите его на консоль в строку.
Определите и выведите на экран сообщение о том, является ли
массив строго возрастающей последовательностью (каждый элемент строго больше предыдущего)
 */
public class Task7 {
    public static void main(String[] args) {
        Service random = new Service();
        int[] intArray = new int[5];
        int counter = 0;
        int compareElement = 9;
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = random.getRandomInt(10, 100);
            if (compareElement > intArray[i]) {
                counter += 1;
            }
            compareElement = intArray[i];
        }
        if (counter == 0) {
            System.out.print(Arrays.toString(intArray));
            System.out.println(": is an increasing sequence");
        } else {
            System.out.print(Arrays.toString(intArray));
            System.out.println(": is NOT an increasing sequence");
        }
    }
}
