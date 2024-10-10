package Animals.view;

import Animals.controler.TypeHandler;
import Animals.model.Animal;

public class Printer {

    public static void PrintAnimal(Animal animal) {

        System.out.println(TypeHandler.GetAnimalType(animal) + animal.toString());
    }
}
