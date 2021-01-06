package com.annyshik;

import com.annyshik.entities.Human;
import com.annyshik.utils.HumanList;

import java.util.Scanner;

public class Main {
    public static int menu() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите номер выбранной задачи из списка:");
        System.out.println("1. Добавить человека");
        System.out.println("2. Вывести список");
        System.out.println("3. Удалить человека по номеру");
        System.out.println("4. Найти человека по имени");
        System.out.println("5. Найти человека по фамилии");
        int resp = sc.nextInt();

        return resp;
    }

//    public HumanList enterNewHuman(int resp, Scanner sc) {
//        Human newHuman = null;
//        if (resp == 1) {
//            System.out.println("Введите ИФО нового человека: ");
//            newHuman = sc.next();


//        }
//    }

    public static void showHumanList(Human[] humans, int resp) {
        if (resp == 2) {
            printArray(humans);
        }
    }
    public static String enterNewHuman(int resp, Scanner sc) {
        String newHuman = null;
        if (resp == 1) {
            System.out.println("Введите ИФО нового человека: ");
            String allName = sc.next();
            newHuman.add(allName);

        }
        return newHuman;
    }


    public static void searchHumanName(Human[] humans, int resp, Scanner sc) {
        if (resp == 4) {
            System.out.print("Введите Имя : ");
            String name = sc.next();
            boolean isFound = false;
            for (Human human : humans) {
                if (human.name.equals(name)) {
                    isFound = true;
                    System.out.println("Найден " + human.name);
                }
            }
            if (!isFound) System.out.println("Пользователь не найден");
        }
    }

    public static void searchHumanName(Human[] humans, int resp, Scanner sc) {
        if (resp == 5) {
            System.out.print("Введите Фамилию : ");
            String surname = sc.next();
            boolean isFound = false;
            for (Human human : humans) {
                if (human.surName.equals(surname)) {
                    isFound = true;
                    System.out.println("Найден " + human.surName);
                }
            }
            if (!isFound) System.out.println("Пользователь не найден");
        }
    }


    /***создание плавающей нумерации для задач массива
     * @param humans массив для создания нумерации
     * @param index присваемое значение для колическтва актуальных страк массива
     * @return возврат посчитанной нумерации */
    public static Human[] remove(Human[] humans, int index) {
        Human[] result = new Human[humans.length - 1];
        for (int i = 0; i < result.length; i++) {
            result[i] = humans[i < index ? i : i + 1];
        }
        return result;
    }

    /*** точка для нумерации задач/элементов массива */
    public static void printArray(Human[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println((i + 1) + ". " + arr[i]);
        }
    }

    public static void main(String[] args) {

        Human[] humans = {
                new Human("Андрей", "Андреев", "Андреич"),
                new Human("Борис", "Борисов", "Борисыч"),
                new Human("Виктор", "Викторов", "Викторович")
        };

        // printArray(humans);
        menu();
    }
}
