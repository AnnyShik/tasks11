package com.annyshik.utils;
import com.annyshik.entities.Human;
import java.util.Arrays;

public class HumanList {

    public static HumanList readHumans;
    private Human[] humanList = new Human[0];

    public Human add(Human human) {
        if (isHumanExist(human)) {
            System.out.println("");
            return human;
        }
        humanList = Arrays.copyOf(humanList, humanList.length + 1);
       return humanList[humanList.length - 1] = human;
    }

    public boolean isHumanExist(Human human) {
        //elem хранит Human
        for (Human elem : humanList) {
            if (elem.equals(human)) {
                return true;
            }
        }
        return false;
    }

    //печатает фио
    public void showList(Human human) {
        for (Human showHuman : humanList) {
            System.out.println(showHuman.toString());
        }
    }

    public Human[] delHuman(int numDelete) {
        Human humanDelList[] = Arrays.copyOf(humanList, humanList.length - 1);
        for (int i = 0, k = 0; i < humanList.length; i++) {
            humanDelList[k++] = humanList[i];
        }
        return humanDelList;
    }



    /*** поиск человека по имени и фамилии
     * @param fullNamePart*/
    public HumanList getFirstOfLastNameList(Human fullNamePart) {
        HumanList temporal = new HumanList();

        for (Human elem : humanList) {
            if (fullNamePart.equals(elem.getName()) || fullNamePart.equals(elem.getSurName())) {
                temporal.add(elem);
            }
        }
        return temporal;
    }


    public Human get(int index) {
        return humanList[index];
    }

    public void set(int index, Human value) {
        humanList[index] = value;
    }

    public int size() {
        return humanList.length;
    }


}