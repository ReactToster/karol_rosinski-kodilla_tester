package com.kodilla.abstracts;

public class Application {
    public static void main(String[] args) {
        Animal dog = new Dog();
        AnimalProcessor animalProcessor = new AnimalProcessor();
        animalProcessor.process(dog);
    }
}
