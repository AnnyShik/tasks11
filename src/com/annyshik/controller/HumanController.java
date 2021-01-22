package com.annyshik.controller;
import com.annyshik.entities.Human;
import com.annyshik.services.HumanService;


public class HumanController {

    private HumanService humanService = new HumanService();

    public Human buildHuman(String surName, String name, String patronymic) {
        return new Human(surName, name, patronymic);
    }

    public void addHuman(Human h) {
        humanService.addHuman(h);
    }

    public void getFirstOfLastNameList(Human h) {
        humanService.getFirstOfLastNameList(h);
    }

    public void delHuman(int h) {
        humanService.delHuman(h);
    }

    public void showList(Human h) {
        humanService.showList(h);
    }
}