package de.telran.homework.ten;

import java.util.Arrays;

// Создайте массив из 8 случайных целых чисел из отрезка [1;10]
// Выведите массив на экран в строку.
// Замените каждый элемент с нечётным индексом на ноль
// Снова выведете массив на экран на отдельной строке
public class Task4 {
    public static void main(String[] args) {
        Service service = new Service();

        int [] intArr = new int[8];
        for (int i = 0; i < intArr.length; i++) {
            intArr[i] = service.getRandomInt(1, 10);
        }
        System.out.println("Your array is ready: " + Arrays.toString(intArr));

        for (int i = 0; i < intArr.length; i++) {
            if (i % 2 != 0) {
                intArr[i] = 0;
            }
        }
        System.out.println("All ode elements are now 0: " + Arrays.toString(intArr));
    }
}
