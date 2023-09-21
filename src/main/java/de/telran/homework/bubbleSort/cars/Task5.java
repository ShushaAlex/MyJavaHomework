package de.telran.homework.bubbleSort.cars;

public class Task5 {
    /*
    Практическое задание
1. Создайте 5 объектов типа Car
a. Объект Car должен содержать поля
● private double price;
● private String model;
● и конструктор с этими полями
2. Сохраните объекты в массив
3. Распечатайте результат
a. Результат печати одного авто должен выглядеть:
● Car - BMW, price = 2.3
4. Применив метод “сортировка пузырьком” отсортируйте массив по
стоимости
5. Распечатайте результат
6. Применив метод “сортировка пузырьком” отсортируйте массив по модели
(первая буква из модели)
7. Распечатайте результат
     */

    public static void main(String[] args) {
        Car car1 = new Car(2500, "Fiat");
        Car car2 = new Car(15000, "Ford");
        Car car3 = new Car(25000, "Toyota");
        Car car4 = new Car(50000, "VW");
        Car car5 = new Car(75000, "Mercedes");

        Car[] cars = {car1, car2, car3, car4, car5};

        for (int i = 0; i < cars.length; i++) {
            System.out.println("Car - " + cars[i].getModel() + ", price = " + cars[i].getPrice());
        }

        System.out.println("Scenario 2");

        for (int i = 0; i < cars.length; i++) {
            cars[i].printCarInfo();
        }

    }

}
