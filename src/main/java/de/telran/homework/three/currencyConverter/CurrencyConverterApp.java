package de.telran.homework.three.currencyConverter;

import java.util.Scanner;

public class CurrencyConverterApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double eurToUsd = 1.07;

        System.out.print("Введите сумму в евро: ");
        double eurCount = scanner.nextDouble();

        double usdCount = eurCount * eurToUsd;

        System.out.println("по текущему обменному курсу ( " + eurToUsd + " ) это составит " + usdCount + "$");
    }
}
