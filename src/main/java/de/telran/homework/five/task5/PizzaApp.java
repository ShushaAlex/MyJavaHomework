package de.telran.homework.five.task5;

public class PizzaApp {

    public static void main(String[] args) {

        Formules formules = new Formules();

        int pizza28Calories = formules.getPizzaCal(formules.getCircleArea(14));
        System.out.println("area 28: " + formules.getCircleArea(14));
        int pizza24Calories = formules.getPizzaCal(formules.getCircleArea(12));
        System.out.println("area 24: " + formules.getCircleArea(12));

        System.out.println("28cm calories: " + pizza28Calories);
        System.out.println("24cm calories: " + pizza24Calories);
        System.out.println("Calories difference: " + (pizza28Calories - pizza24Calories));
    }
}
