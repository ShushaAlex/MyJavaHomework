package de.telran.homework.three.countSystemConverter;

public class CountSystemConverterApp {
    public static void main(String[] args) {

        String binaryString = "101101";
        int decimal = Integer.parseInt(binaryString,2); //    101101 в двоичной, переведите в 10-ичную
        System.out.println(decimal);

        String binaryInt = Integer.toBinaryString(124); //    124 в десятичной, переведите в 2-ичную
        System.out.println(binaryInt);

        String hexInt = Integer.toHexString(819); //    Переведите число 819 из 10-ричной в 16-ричную
        System.out.println(hexInt);

        String hexString = "333";
        int decInt = Integer.parseInt(hexString,16); //    Переведите число 333 из 16-ричной в 10-ричную
        System.out.println(decInt);
    }
}