package de.telran.homework.five.task4;

public class secondsToHoursApp {
    public static void main(String[] args) {
        Services services = new Services();

        int sec = services.getRandomSeconds();

        int hours = services.convertSecToHours(sec);

        if (hours == 0) {
            System.out.println(sec + " seconds to the end of the work day.");
            System.out.println("there's less than an hour to the end of the work day.");
        } else {
            System.out.println(sec + " seconds to the end of the work day.");
            System.out.println(hours + " hours to the end of the work day.");
        }
    }
}
