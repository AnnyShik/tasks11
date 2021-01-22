package com.annyshik;
import com.annyshik.UI.HumanUI;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        HumanUI humanUI = new HumanUI(sc);

        humanUI.printMenu();
        humanUI.chooseActionByResponse();
        System.out.println("Bye Bye!");

    }
}
