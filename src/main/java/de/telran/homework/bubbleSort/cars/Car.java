package de.telran.homework.bubbleSort.cars;

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

//    public Array sortByPrice(Car cars) {
//        int stepsCount = Array.getLength(cars) - 1;
//        boolean swapped;
//
//        do {
//            swapped = false;
//            for (int i = 0; i < stepsCount - 1; i++) {
//                if (cars[i].getPrice() > cars[i + 1].getPrice()) {
//
//                }
//            }
//        }
//
//    }

}
