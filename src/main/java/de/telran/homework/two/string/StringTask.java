package de.telran.homework.two.string;

public class StringTask {
    public static void main(String[] args) {

        String myString = new String("I study Basic Java!"); // Создайте строку через new - I study Basic Java!

        MyTestStringMethod myNewString = new MyTestStringMethod(myString);// Напишите метод, который принимает в качестве параметра строку, передайте в этот метод строку, которую создали в п.1

        System.out.println(myNewString.secondToLastChar());// Распечатать пред-последний символ строки. Используем метод String.charAt().

        System.out.println(myNewString.stringContainsJava());// Проверить, содержит ли ваша строка подстроку “Java”. Используем метод String.contains().

        System.out.println(myNewString.getSubstringJava()); // Вырезать строку Java c помощью метода String.substring().

        System.out.println(myNewString.replaceChars());// Заменить все символы “а” на “о”.

        System.out.println(myNewString.toUpperCase());// Преобразуйте строку к верхнему регистру.

        System.out.println(myNewString.toLowerCase()); // Преобразуйте строку к нижнему регистру.
    }
}