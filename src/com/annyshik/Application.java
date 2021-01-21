package com.annyshik;

import com.annyshik.UI.HumanUI;

public class Application {

    public static void main(String[] args) {
        HumanUI humanUI = new HumanUI();

        humanUI.printMenu();
        humanUI.chooseActionByResponse();


    }
}
