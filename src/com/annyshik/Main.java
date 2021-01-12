package com.annyshik;

import com.annyshik.entities.Human;
import com.annyshik.services.HumanService;
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
        System.out.print("Введите номер: ");
        int resp = sc.nextInt();

        return resp;
    }

    /*** добавление человека в список массива
     * @return возврат значения элемента для удаления     */
    public String enterNewHuman(int resp, Scanner sc) {
        String newHuman = null;
        if (resp == 1) {
            System.out.println("Введите ФИО нового человека: ");
            newHuman = sc.nextLine();
            HumanList humanList = new HumanList(sc);
            HumanService humanService = new HumanService();
            HumanList humans = humanList.readHumans();
            humanService.addHuman(humans);
        }
        return newHuman;
    }


//    /*** удаление элемента массива
//     * @return возврат значения элемента для удаления  */
//    public static int deleteHum(int resp, Scanner sc) {
//        int numDelete = 0;
//        if (resp == 3) {
//            System.out.println("Введите номер человека для удаления: ");
//            numDelete = sc.nextInt() - 1;
//        }
//        return numDelete;
//    }

    /*** человека по имени */
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

    /*** человека по фамилии */
    public static void searchHumanSurName(Human[] humans, int resp, Scanner sc) {
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


//    /***создание плавающей нумерации для задач массива
//     * @param humans массив для создания нумерации
//     * @param index присваемое значение для колическтва актуальных страк массива
//     * @return возврат посчитанной нумерации */
//    public static Human[] remove(Human[] humans, int index) {
//        Human[] result = new Human[humans.length - 1];
//        for (int i = 0; i < result.length; i++) {
//            result[i] = humans[i < index ? i : i + 1];
//        }
//        return result;
//    }

    /*** точка для нумерации задач/элементов массива */
    public static void printArray(Human[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println((i + 1) + ". " + arr[i]);
        }
    }

    public static void main(String[] args) {

        Human[] humans = {
                new Human("Андрев", "Андрей", "Андреич"),
                new Human("Борисов", "Борис", "Борисыч"),
                new Human("Викторов", "Виктор", "Викторович")
        };

        menu();
        printArray(humans);

        /***создание нового массива с новой ячейкой для потенциальной новой задачи
         * внесение новой задания в ячейку */
        HumanList resultHumanList = HumanList.readHumans;
        for (int i = 0; i < resultHumanList.size(); i++) {
            Human newHum = resultHumanList.get(i);
            System.out.println(newHum.getName() + " " +
                    newHum.getSurName() + " " +
                    newHum.getPatronymic());
        }
    }
}
