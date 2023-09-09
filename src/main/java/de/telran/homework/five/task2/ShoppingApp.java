package de.telran.homework.five.task2;
public class ShoppingApp {
    public static void main(String[] args) {
        Shopping goShopping = new Shopping();
        boolean isEdekaOpen = true;
        boolean isReweOpen = true;

        System.out.println(goShopping.canBuy(isEdekaOpen, isReweOpen));

        }

    }

//    Создайте две переменные isEdekaOpen и isReweOpen, значения которых зависят от того,
//    открыты магазины или нет (значения задайте сами). Реализуйте логический метод canBuy,
//    возвращающий true / false Значение этой переменной должно быть true, если хотя бы один
//    магазин открыт, иначе false. Отобразите строку «Я могу купить еду, это ……» и значение.