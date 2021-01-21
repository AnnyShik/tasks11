package com.annyshik.services;

import com.annyshik.entities.Human;
import com.annyshik.utils.HumanList;


public class HumanService {
    private HumanList humanList = new HumanList();

    public void addHuman(Human human) {
        humanList.addHuman(human);
    }


    public void delHuman(Human human) {
        humanList.delHuman(human);
    }
    //вызв делит



    public void showList(Human human) {
        humanList.showList(human);
    }

    public void getFirstOfLastNameList(Human human) {
        humanList.getFirstOfLastNameList(human);
    }
}