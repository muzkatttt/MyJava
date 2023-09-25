package seminars.first.model;

import java.util.List;

public class Hero {
    private String name;
    private int armorStrength;
    private String weapon;
    private List<String> bag;
    private boolean isHuman;

    public Hero(String name, int armorStrength, String weapon, List<String> bag, boolean isHuman) {
        this.name = name;
        this.armorStrength = armorStrength;
        this.weapon = weapon;
        this.bag = bag;
        this.isHuman = isHuman;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getArmorStrength() {
        return armorStrength;
    }

    public void setArmorStrength(int armorStrength) {
        this.armorStrength = armorStrength;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public List<String> getBag() {
        return bag;
    }

    public void setBag(List<String> bag) {
        this.bag = bag;
    }

    public boolean isHuman() {
        return isHuman;
    }

    public void setHuman(boolean human) {
        isHuman = human;
    }
}
