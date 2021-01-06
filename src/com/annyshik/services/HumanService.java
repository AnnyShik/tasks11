package com.annyshik.services;

import com.annyshik.entities.Human;
import com.annyshik.utils.HumanList;

import java.util.Scanner;

public class HumanService {
    private HumanList humans = new HumanList();

    public void addHuman(Human h) {
        humans.add(h);
    }

    public void addHumans(HumanList list) {
        for (int i = 0; i < list.size(); i++) {
            humans.add(list.get(i));
        }
    }
    public void deleteHuman(Human h) {
        humans.delete(h);
    }

    public void deleteHuman(HumanList list) {
        for (int i = 0; i < list.size(); i++) {
            humans.delete(list.get(i));
        }
    }

}