package com.annyshik.entities;

import java.util.Objects;

public class Human {

    private String surName;
    private String name;
    //это состояния объекта
    private String patronymic;

    public Human(String surName,String name,  String patronymic) {
        this.surName = surName;
        this.name = name;
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
                " " + patronymic;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || obj.getClass() != this.getClass())

            return false;
        Human human = (Human) obj;
        return
                Objects.equals(this.surName, human.surName) &&
                Objects.equals(this.name, human.name) &&
                Objects.equals(this.patronymic, human.patronymic);
    }

    @Override
    public int hashCode() {
        return Objects.hash(surName, name, patronymic);
    }

}
