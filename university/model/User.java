package model;

public abstract class User {
    protected int id;
    protected String name;
    protected String lastName;
    protected int groupId;

    public User(int id, String name, String lastName, int groupId) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.groupId = groupId;
    }

    @Override
    public String toString() {
        return String.format(getClass().getSimpleName() + ": id = %s, name = %s, lastName = %s, groupId = %s", id, name, lastName, groupId);
    }

    public int getId(){
        return id;
    }
}