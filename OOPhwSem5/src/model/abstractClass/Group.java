package model.abstractClass;

import java.util.ArrayList;
import java.util.List;

public abstract class Group<T extends Users> {
    int numberOfGroup;
    private List<T> users;

    public Group(int numberOfGroup, List<T> users) {
        this.numberOfGroup = numberOfGroup;
        this.users = users;
    }

    public Group(int numberOfGroup) {
        this(numberOfGroup, new ArrayList<>());
    }

    public int getNumberOfGroup() {
        return numberOfGroup;
    }

    public void setNumberOfGroup(int numberOfGroup) {
        this.numberOfGroup = numberOfGroup;
    }

    protected abstract void addToGroup();

    public List<T> getUsers() {
        return users;
    }

    public void setUsers(List<T> users) {
        this.users = users;
    }

    @Override
    public String toString() {
        return "Group{" +
                "numberOfGroup=" + getNumberOfGroup() +
                ", users=" + getUsers() +
                '}';
    }
}
