package de.telran.homework.bubbleSort;
import java.util.Arrays;
import java.util.Random;
public class Test {
        //    Создайте массив из 12 случайных целых чисел из отрезка [-15;15].
//    Определите какой элемент является в этом массиве максимальным и
//    сообщите индекс его последнего вхождения в массив.
        public static void main(String[] args) {
            Random random = new Random();
            int[] massive = new int[12];
            int len = 0;
            int masRange = 15;
            int maxInd = -1;
            for (int i = 0; i < massive.length; i++) {
                massive[i] = random.nextInt((masRange + 1) * 2) - masRange;
                if (massive[i] > maxInd) {
                    maxInd = i;
                }
            }
            System.out.println(Arrays.toString(massive));
            printCursor(massive, maxInd);
            System.out.println("ind = "+maxInd+"("+massive[maxInd]+")");

        }
        public static void printCursor(int[] mas, int cur ){
            for (int i = 0; i < cur; i++){
                int l = Integer.toString(mas[i]).length();
                for (int j=0; j < l; j++){
                    System.out.print(" ");
                }
                System.out.print("  ");
            }
            System.out.println(" ^");
        }
    }
