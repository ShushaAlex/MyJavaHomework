package de.telran.homework.ten;
import java.util.Arrays;

//Создайте массив из 12 случайных целых чисел из отрезка [-15;15].
//Определите какой элемент является в этом массиве максимальным и
//сообщите индекс его последнего вхождения в массив.
public class Task3 {
    public static void main(String[] args) {
        Service service = new Service();
        int[] intArr = new int[12];
        int[] arrayForSort = new int[12];
        for (int i = 0; i < intArr.length; i++) {
            intArr[i] = service.getRandomInt(-15, 16);
            arrayForSort[i] = intArr[i];
        }

        int[] sortedArray = service.sortArray(arrayForSort);
        int biggestNum = sortedArray[sortedArray.length - 1];
        int indexOfBiggestNum = service.getLastIndexOfSearchElement(intArr, biggestNum);

        System.out.println("Your array is ready! " + Arrays.toString(intArr));
        System.out.println("The biggest number in array is " + biggestNum +
                ". Index of its last appearance in the array is " + indexOfBiggestNum + ".");
    }
}
