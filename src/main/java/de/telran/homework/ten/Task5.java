package de.telran.homework.ten;

import java.util.Arrays;

//Создайте 2 массива из 5 случайных целых чисел из отрезка [0;5] каждый
// Выведите массивы на экран в двух отдельных строка.
// Посчитайте среднее арифметическое элементов каждого массива и сообщите,
// для какого из массивов это значение оказалось больше (либо сообщите, что их средние арифметические равны)
public class Task5 {
    public static void main(String[] args) {
        Service service = new Service();
        int[] array1 = new int[5];
        int[] array2 = new int[5];
        int arrayLength = 5;
        int array1Sum = 0;
        int array2Sum = 0;

        for (int i = 0; i < array1.length; i++) {
            array1[i] = service.getRandomInt(0, 6);
            array1Sum += array1[i];
            array2[i] = service.getRandomInt(0, 6);
            array2Sum += array2[i];
        }
        System.out.println("First array: " + Arrays.toString(array1));
        System.out.println("Second array: " + Arrays.toString(array2));

        int average1 = service.simpleAverage(array1Sum, arrayLength);
        int average2 = service.simpleAverage(array2Sum, arrayLength);

        if(average1 > average2) {
            System.out.println("Average of the first array (" + average1 + ") is bigger than the average of the second array (" + average2 + ")");
        } else if (average2 > average1) {
            System.out.println("Average of the second array (" + average2 + ") is bigger than the average of the first array (" + average1 + ")");
        } else {
            System.out.println("Average of the first array (" + average1 + ") is equal to the average of the second array (" + average2 + ")");
        }

    }

}
