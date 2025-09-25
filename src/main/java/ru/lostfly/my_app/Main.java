package ru.lostfly.my_app;

import org.apache.commons.lang3.StringUtils;
import ru.lostfly.my_app.animals.AnimalExample;
import ru.lostfly.my_app.animals.Cat;
import ru.lostfly.my_app.animals.Dog;
import ru.lostfly.my_app.animals.Parrot;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class Main {


    public static void main(String[] args) {

        Cat catBig = new Cat("cat1");

        Dog dogSmall = new Dog("dog1");

        Parrot parrot = new Parrot("1");

        List<AnimalExample> animals = List.of(catBig, dogSmall, parrot);

        animals.forEach(animal -> System.out.println(animal.animalType()));

        String text = "hello world";
        String[] capitalizedText = StringUtils.splitByCharacterType(text);

        System.out.println(Arrays.toString(capitalizedText));
    }
}
