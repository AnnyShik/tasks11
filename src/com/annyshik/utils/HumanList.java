package com.annyshik.utils;

import com.annyshik.entities.Human;

import java.util.Arrays;
import java.util.Scanner;

public class HumanList {

    private Human[] humans = new Human[0];

    public void add(Human h) {
        humans = Arrays.copyOf(humans, humans.length + 1);
        humans[humans.length - 1] = h;
    }

//    public void delete(Human h) {
//        humans = Arrays.copyOf(humans, humans.length - 1);
//        humans[humans.length - 1] = h;
//    }

    public HumanList readHumans(int index, Scanner sc){ ///1:11:00 0:55:00
        HumanList humans = new HumanList();
        for (int i = 0; i < index; i++) {
            System.out.println("Введите ФИО нового человека: ");
            System.out.println("Фамилия: ");
            String surName = sc.nextLine();
            System.out.println("Имя: ");
            String name = sc.nextLine();
            System.out.println("Отчество: ");
            String patronymic = sc.nextLine();

            Human newHum = new Human(surName, name, patronymic);
            humans.add(newHum);
        }
    }

    public Human get(int index) {
        return humans[index];
    }

    public void set(int index, Human value) {
        humans[index] = value;
    }

    public int size() {
        return humans.length;
    }


}