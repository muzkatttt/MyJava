package model.abstractClass;

import java.util.List;

public abstract class Group {
    int numberOfGroup;

    private List<Users> users;

    protected abstract void addToGroup();

    public Group(int numberOfGroup) {
        this.numberOfGroup = numberOfGroup;
    }

    public int getNumberOfGroup() {
        return numberOfGroup;
    }

    public void setNumberOfGroup(int numberOfGroup) {
        this.numberOfGroup = numberOfGroup;
    }

    public Group(List<Users> users) {
        this.users = users;
    }

    public List<Users> getUsers() {
        return users;
    }

    public void setUsers(List<Users> users) {
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
