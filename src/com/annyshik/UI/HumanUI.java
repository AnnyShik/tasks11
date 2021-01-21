package com.annyshik.UI;

import com.annyshik.controller.HumanController;
import com.annyshik.entities.Human;

import java.util.Scanner;

public class HumanUI {
    private Scanner sc = new Scanner(System.in);
    private HumanController humanController = new HumanController();


    static Human[] humans = {
            new Human("Андреев", "Андрей", "Андреич"),
            new Human("Борисов", "Борис", "Борисыч"),
            new Human("Викторов", "Виктор", "Викторович")
    };

    public void printMenu() {
        System.out.println("Введите номер выбранной задачи из списка:");
        System.out.println("1. Добавить человека");
        System.out.println("2. Вывести список");
        System.out.println("3. Удалить человека по номеру");
        System.out.println("4. Найти человека по имени");
        System.out.println("5. Найти человека по фамилии");
        System.out.println("Введите номер: ");
    }

    public Human returnHuman() {
        System.out.println("Введите ФИО нового человека");
        System.out.println("Фамилия: ");
        String surName = sc.nextLine();
        System.out.println("Имя: ");
        String name = sc.nextLine();
        System.out.println("Отчество: ");
        String patronymic = sc.nextLine();
        return humanController.buildHuman(surName, name, patronymic);
    }

    public int deleteHuman() {
        int numDelete = 0; //номер удаляемого человека
        System.out.println("Введите номер человека для удаления: ");
        numDelete = sc.nextInt() - 1;
        return numDelete;
    }

    /*** точка для нумерации задач/элементов массива */
    public static void printArray(Human[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println((i + 1) + ". " + arr[i]);
        }
    }

    public Human showHuman() {
        printArray(humans);
        return null;
    }

    public void chooseActionByResponse() {
        int resp = sc.nextInt();
        sc.nextLine();
        if
        (resp == 1) {
            Human newHuman = returnHuman();
            humanController.addHuman(newHuman);
        } else if
        (resp == 2) {
            Human showHuman = showHuman();
            humanController.showList(showHuman);
        } else if (resp == 3) {
            int deleteHuman = deleteHuman();
            //         humanController.delHuman(deleteHuman);
            //ИСПРАВИТЬ
        } else if
        (resp == 4) {
            Human searchName = searchHumanName();
            humanController.getFirstOfLastNameList(searchName);
        } else if
        (resp == 5) {
            Human searchName = searchHumanSurName();
            humanController.getFirstOfLastNameList(searchName);}
        else ;
    }

    public Human searchHumanName() {
        System.out.print("Введите Имя : ");
        String name = null;
        name = sc.nextLine();
        boolean isFound = false;
        for (Human human : humans) {
            if (name.equals(human.getName())) {
                isFound = true;
                System.out.println("Найден " + name);
            }
        }
        if (!isFound) System.out.println("Пользователь не найден");
        return null;
    }


//    /*** поиск человека по имени */
//    public Human searchHumanName() {
//        System.out.print("Введите Имя : ");
//        String name = null;
//        name = sc.nextLine();
//        boolean isFound = false;
//        for (Human human : humans) {
//            if (name.equals(human.getName())) {
//                isFound = true;
//                System.out.println("Найден " + name);
//            }
//        }
//        if (!isFound) System.out.println("Пользователь не найден");
//        return null;
//    }

    /*** поиск человека по фамилии */
    public Human searchHumanSurName() {
        System.out.print("Введите Фамилию : ");
        String surName = null;
        surName = sc.nextLine();
        boolean isFound = false;
        for (Human human : humans) {
            if (surName.equals(human.getSurName())) {
                isFound = true;
                System.out.println("Найден " + surName);
            }
        }
        if (!isFound) System.out.println("Пользователь не найден");
        return null;
    }
}
