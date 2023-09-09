package de.telran.homework.five.task2;

public class Shopping {

    public String canBuy(boolean firstShop, boolean secondShop) {
        return firstShop || secondShop ? "you can go shopping!" : "stay at home, shops are closed!";
    }
}
