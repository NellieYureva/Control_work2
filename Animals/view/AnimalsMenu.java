package Animals.view;

import Animals.controler.Counter;
import Animals.controler.TypeHandler;
import Animals.model.Animal;
import Animals.model.AnimalsList;
import Animals.model.Camel;
import Animals.model.Cat;
import Animals.model.Dog;
import Animals.model.Donkey;
import Animals.model.Hamster;
import Animals.model.Horse;

import java.util.Scanner;
import java.util.ArrayList;

public class AnimalsMenu {

    public void run(AnimalsList animalsList) {

        try (Scanner in = new Scanner(System.in, "Cp866"); Counter counter = new Counter(0)) {

            String com = null;

            while (true) {

                System.out.println();
                EnterMenu.printMenu();
                com = prompt("Введите команду: ", in).toUpperCase();
                System.out.println();

                if (com.equals("EXIT")) {
                    return;
                }

                switch (com) {
                    case "1":
                        list(animalsList);
                        break;
                    case "2":
                        try {
                            if (add(animalsList, in))
                                counter.add();
                            System.out.println("Счетчик = " + counter.getCount());
                        } catch (NullPointerException e) {
                            System.out.println("Введен недопустимы тип животного.");
                        }
                        break;
                    case "3":
                        commandsList(animalsList, in);
                        break;
                    case "4":
                        addCommands(animalsList, in);
                        break;
                }
            }
        }
    }

    public void list(AnimalsList animalsList) {
        for (Animal animal : animalsList) {
            PrintAnimal(animal);
        }
    }

    public boolean add(AnimalsList animalsList, Scanner in) {

        Animal newAnimal = null;

        String typeAnimal = prompt("Введите тип животного (Собака, Кошка, Хомяк, Лошадь, Верблюд или Осел): ", in)
                .toUpperCase();

        switch (typeAnimal) {
            case "СОБАКА":
                newAnimal = new Dog(null, null, null);
                break;
            case "КОШКА":
                newAnimal = new Cat(null, null, null);
                break;
            case "ХОМЯК":
                newAnimal = new Hamster(null, null, null);
                break;
            case "ЛОШАДЬ":
                newAnimal = new Horse(null, null, null);
                break;
            case "ВЕРБЛЮД":
                newAnimal = new Camel(null, null, null);
                break;
            case "ОСЕЛ":
                newAnimal = new Donkey(null, null, null);
                break;
        }

        newAnimal.getClass();
        String name = prompt("Введите имя животного: ", in);
        newAnimal.setName(name);
        String com = prompt("Введите комманду для обучения: ", in);
        ArrayList<String> temp = new ArrayList<>();
        temp.add(com);
        newAnimal.setCommands(temp);
        String date_of_birth = prompt("Введите дату рождения животного в формате ДД-ММ-ГГГГ: ", in);
        newAnimal.setDate_of_birth(date_of_birth);
        animalsList.addAnimal(newAnimal);

        if (name.isEmpty() || com.isEmpty() || date_of_birth.isEmpty()) {
            return false;
        }

        return true;
    }

    public void commandsList(AnimalsList animalsList, Scanner in) {
        String name = prompt("Введите кличку животного, чьи команды желаете узнать: ", in);
        Animal animal = findAnimal(animalsList, name);

        if (animal == null) {
            System.out.println("Такого животного нет в списке!");
        } else {
            System.out.printf("\nЖивотное %s, кличка %s, выполняет команды %s.\n",
                    TypeHandler.GetAnimalType(animal), animal.getName(), animal.getCommands());
        }
    }

    public void addCommands(AnimalsList animalsList, Scanner in) {
        String name = prompt("Введите кличку животного, которое хотите обучить: ", in);
        Animal animal = findAnimal(animalsList, name);

        if (animal == null) {
            System.out.println("Такого животного нет в списке!");
        } else {
            ArrayList<String> commands = animal.getCommands();
            String newCommand = prompt("Введите новую команду: ", in);
            commands.add(newCommand);
            animal.setCommands(commands);
        }
    }

    public Animal findAnimal(AnimalsList animalsList, String name) {
        for (Animal animal : animalsList) {
            if (animal.getName().equals(name)) {
                return animal;
            }
        }
        return null;
    }

    public String prompt(String message, Scanner in) {

        System.out.print(message);
        return in.nextLine();
    }

    public static void PrintAnimal(Animal animal) {

        System.out.println(TypeHandler.GetAnimalType(animal) + animal.toString());
    }

    
}




