package ru.lostfly.my_app;

import org.apache.commons.lang3.StringUtils;
import ru.lostfly.my_app.animals.AnimalExample;
import ru.lostfly.my_app.animals.Cat;
import ru.lostfly.my_app.animals.Dog;

import java.util.Arrays;
import java.util.Set;

public class Main {


    public static void main(String[] args) {

        Cat catBig = new Cat("cat1");

        Dog dogSmall = new Dog("dog1");

        Set<AnimalExample> animals = Set.of(catBig, dogSmall);

        animals.forEach(animal -> System.out.println(animal.animalType()));

        String text = "hello world";
        String[] capitalizedText = StringUtils.splitByCharacterType(text);

        System.out.println(Arrays.toString(capitalizedText));
    }
}
