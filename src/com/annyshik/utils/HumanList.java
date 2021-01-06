package com.annyshik.utils;

import com.annyshik.entities.Human;

import java.util.Arrays;

public class HumanList {
    private Human[] humans = new Human[0];

    public void add(Human h) {
        humans = Arrays.copyOf(humans, humans.length + 1);
        humans[humans.length - 1] = h;
    }
    public void delete(Human h) {
        humans = Arrays.copyOf(humans, humans.length - 1);
        humans[humans.length - 1] = h;
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