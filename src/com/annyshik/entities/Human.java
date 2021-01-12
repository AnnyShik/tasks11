package com.annyshik.entities;

import java.util.Objects;

public class Human{

    public String name;
    public String surName;
    public String patronymic;

    public Human(String name, String surName, String patronymic) {
        this.name = name;
        this.surName = surName;
        this.patronymic = patronymic;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }


    @Override
    public String toString() {
        return surName +
               " " + name +
               " " + patronymic ;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Human human = (Human) obj;
        return
               Objects.equals(surName, human.surName) &&
                Objects.equals(name, human.name) &&
                       Objects.equals(patronymic, human.patronymic);
    }

    @Override
    public int hashCode() {
        return Objects.hash(surName, name, patronymic);
    }

}
