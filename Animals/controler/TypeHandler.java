package Animals.controler;

import Animals.model.Animal;
import Animals.model.Camel;
import Animals.model.Cat;
import Animals.model.Dog;
import Animals.model.Donkey;
import Animals.model.Hamster;
import Animals.model.Horse;

public class TypeHandler {
    public static String GetAnimalType(Animal animal) {

        if (animal instanceof Dog) {
            return "Собака";
        } else if (animal instanceof Cat) {
            return "Кошка";
        } else if (animal instanceof Hamster) {
            return "Хомяк";
        } else if (animal instanceof Horse) {
            return "Лошадь";
        } else if (animal instanceof Camel){
            return "Верблюд";
        } else if (animal instanceof Donkey){
            return "Осел";
        } else {
            return null;
        }
    }
}

