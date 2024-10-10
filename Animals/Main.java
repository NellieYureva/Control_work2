package Animals;
import java.util.ArrayList;
import java.util.Arrays;

import Animals.model.AnimalsList;
import Animals.model.Cat;
import Animals.model.Dog;
import Animals.model.Donkey;
import Animals.view.AnimalsMenu;

public class Main {
    public static void main(String[] args) {

        AnimalsList animalsList = new AnimalsList();

        animalsList.addAnimal(new Dog("Бим", new ArrayList<>(Arrays.asList("Стоять", "Бежать")), "04-10-2023"))
                .addAnimal(new Cat("Оливия", new ArrayList<>(Arrays.asList("Вперед")), "25-02-2024"))
                .addAnimal(new Donkey("Иа", new ArrayList<>(Arrays.asList("Страдать", "Бухтеть")), "15-10-2021"));

        AnimalsMenu text = new AnimalsMenu();
        text.run(animalsList);
    }
}