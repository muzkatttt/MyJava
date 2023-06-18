package users;

import abstractClasses.BaseUserGroup;

public class UserGroup extends BaseUserGroup {
    int numberGroup;
    public UserGroup() {
    }

    public UserGroup(int numberGroup) {
        setNumberGroup(numberGroup);
    }

    public int getNumberGroup() {
        return numberGroup;
    }

    public void setNumberGroup(int numberGroup) {
        this.numberGroup = numberGroup;
    }

    @Override
    public String toString() {
        return "UserGroup{}" + getNumberGroup() + ".";
    }
}
