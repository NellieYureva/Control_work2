package Animals.model;

import java.util.ArrayList;

public abstract class Animal {
    private String name;
    private ArrayList<String> commands;
    private String date_of_birth;

    public Animal(String name, ArrayList<String> commands, String date_of_birth) {
        this.name = name;
        this.commands =commands;
        this.date_of_birth = date_of_birth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<String> getCommands() {
        return commands;
    }

    public void setCommands(ArrayList<String> commands) {
        this.commands = commands;
    }

    public String getDate_of_birth() {
        return date_of_birth;
    }

    public void setDate_of_birth(String date_of_birth) {
        this.date_of_birth = date_of_birth;
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        res.append(String.format("\n\tКличка: %s", this.getName()))
                .append(String.format("\n\tВыполняет команды: %s", this.getCommands()))
                .append(String.format("\n\tДата рождения: %s", this.getDate_of_birth()));
        return res.toString();
    }
}