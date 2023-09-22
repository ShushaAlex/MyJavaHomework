package de.telran.homework.ten;
import java.util.Arrays;

/*
Создайте массив из 12 случайных целых чисел из отрезка [-15;15].
Определите какой элемент является в этом массиве максимальным и
сообщите индекс его последнего вхождения в массив.
 */
public class Task3Optimised {
    public static void main(String[] args) {
        Service random = new Service();
        int[] intArr = new int[12];
        int maxNumIndex = -1;

        for (int i = 0; i < intArr.length; i++) {
            intArr[i] = random.getRandomInt(-15, 16);
            if (intArr[i] > maxNumIndex) {
                maxNumIndex = i;
            }
        }

        System.out.println(Arrays.toString(intArr));
        System.out.println("The biggest num in array is: " + intArr[maxNumIndex] + ". It has index: " + maxNumIndex);
    }
}


/*
1. в цикле заполнить массив
2. во время заполнения сохранять наибольший элемент массива и его индекс
3. вывести в консоль наибольший элемент и его индекс
 */