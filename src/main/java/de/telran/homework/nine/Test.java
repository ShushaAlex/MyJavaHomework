package de.telran.homework.nine;

public class Test {
    public static void main(String[] args) {
        Services services = new Services();
        int[] intArr1 = {1, 2, 3, 4, 5, 6, 10};
        int[] intArr2 = {1, 2, 7, 9, 5, 6};

        System.out.println("========== Test 1 ===========");

        if (services.isIncreasingSequence(intArr1)) {
            System.out.println("Test 1 PASSED");
        } else {
            System.out.println("Test 1 FAILED! Expected TRUE, but recieved: " + services.isIncreasingSequence(intArr1));
        }

        System.out.println("========== Test 2 ===========");

        if (!services.isIncreasingSequence(intArr2)) {
            System.out.println("Test 2 PASSED");
        } else {
            System.out.println("Test 2 FAILED! Expected FALSE, but recieved: " + services.isIncreasingSequence(intArr1));
        }
    }
}
