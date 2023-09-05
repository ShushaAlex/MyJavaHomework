package de.telran.homework.three.firstTask;

import de.telran.homework.three.firstTask.service.HalfSubstring;
import de.telran.homework.three.firstTask.userInterface.UserInput;
import de.telran.homework.three.firstTask.userInterface.UserOutput;

public class StringApp {
    public static void main(String[] args) {
        UserInput ui = new UserInput();
        UserOutput uo = new UserOutput();
        HalfSubstring halfSubstring = new HalfSubstring();

        System.out.print("введите первое слово с четным количеством символов: ");
        String firstWord = ui.inputString();

        System.out.print("введите второе слово с четным количеством символов: ");
        String secondWord = ui.inputString();

        uo.printData(
                "Вжух и готово! -> ",
                halfSubstring.cutFirstHalfString(firstWord),
                halfSubstring.cutSecondHalfString(secondWord));
    }
}
