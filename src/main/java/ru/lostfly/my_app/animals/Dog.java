package ru.lostfly.my_app.animals;

public class Dog implements AnimalExample {

    String name;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public String animalType() {
        return "IT IS DOG";
    }
}
