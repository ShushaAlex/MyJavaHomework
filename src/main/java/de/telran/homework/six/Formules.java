package de.telran.homework.six;

public class Formules {

    double circleArea(double radius) {
        return radius * radius * 3.14;
    }

    double squareArea(double side) {
        return  Math.pow(side, 2);
    }

    double rectangleArea(double sideA, double sideB) {
        return sideA * sideB;
    }

    double circlePerimeter(double radius) {
        return (2 * 3.1415 * radius);
    }

    double squarePerimeter(double sideA) {
        return sideA * 4;
    }

    double rectanglePerimeter(double sideA, double sideB) {
        return (sideA + sideB) * 2;
    }
}
