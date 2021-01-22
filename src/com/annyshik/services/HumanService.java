package com.annyshik.services;
import com.annyshik.entities.Human;
import com.annyshik.utils.HumanList;


public class HumanService {
    private HumanList humanList = new HumanList();

    public void addHuman(Human human) {
        humanList.add(human);
    }

    public void delHuman(int human) {
        humanList.delHuman(human);
    }

    public void showList(Human human) {
        humanList.showList(human);
    }

    public void getFirstOfLastNameList(Human human) {
        humanList.getFirstOfLastNameList(human);
    }



}