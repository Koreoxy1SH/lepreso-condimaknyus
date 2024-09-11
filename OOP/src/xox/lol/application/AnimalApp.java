package xox.lol.application;

import xox.lol.annotation.Fancy;
import xox.lol.data.Animal;
import xox.lol.data.Cat;


@Fancy(name = "AnimalApp", tags = {"Application", "java"})
public class AnimalApp {

    public static void main(String[] args) {
        Animal animal = new Cat();

        animal.name = "Meong ";
        animal.run();
        
    }
    
}
