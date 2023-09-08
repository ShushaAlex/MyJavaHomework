package de.telran.homework.five.task1;

public class Weather {
    public static void main(String[] args) {
        UserAnswers ui = new UserAnswers();
        System.out.println("Please answer 'yes' or 'no'");

        boolean isWeekend = ui.isWeekend();
        boolean isRain = ui.isRainy();

        boolean canWalk;

        if (!isRain && isWeekend) {
            canWalk = true;
        } else {
            canWalk = false;
        }
        System.out.println("canWalk is " + canWalk);


    }
}

//    Создайте две переменные isWeekend и isRain. Дайте им свои произвольные значения.
//    Создайте переменную canWalk, значение которой должно быть истинным, если это выходной
//    день (isWeekend=true) и не идет дождь (isRain=false).