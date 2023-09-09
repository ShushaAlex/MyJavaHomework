package de.telran.homework.five.task3;

public class WorkConditions {

    boolean isWorkingCorrect(int temperature1, int temperature2) {
        if (temperature1 > 100 && temperature2 < 100) {
            return true;
        } else {
            return false;
        }
    }
}


//3 Представим, что у нас есть устройство, в котором две колбы. Прибор работает корректно,
// если температура первой колбы выше 100 градусов, а температура второй колбы меньше 100 градусов.
// Вы должны написать метод, который проверяет это устройство. Ваша программа должна иметь переменные
// Temperature1 и Temperature2. В результате он выводит сообщение true или false.