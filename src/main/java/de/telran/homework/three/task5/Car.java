package de.telran.homework.three.task5;

public class Car {
    private double price;
    private String model;

    public Car(double price, String model) {
        this.price = price;
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public String getModel() {
        return model;
    }

    public void printCarInfo(){
        System.out.println("Car - " + model + ", price = " + price);

    }

}
