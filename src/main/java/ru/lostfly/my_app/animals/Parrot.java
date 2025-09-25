package ru.lostfly.my_app.animals;

public class Parrot implements AnimalExample {

    String name;

    public Parrot(String name) {
        this.name = name;
    }

    @Override
    public String animalType() {
        return "IT IS PARROT";
    }
}
