package ru.lostfly.my_app.animals;

public class Cat implements AnimalExample {

    String name;

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public String animalType() {
        return "IT IS CAT";
    }
}
