package models;

public abstract class HotDrink {
    protected int temperature;
    protected int cost;
    protected int id;
    protected boolean isReadyToServe;

    public HotDrink(int temperature, int cost, int id, boolean isReadyToServe) {
        this.temperature = temperature;
        this.cost = cost;
        this.id = id;
        this.isReadyToServe = isReadyToServe;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isReadyToServe() {
        return isReadyToServe;
    }

    public void setReadyToServe(boolean readyToServe) {
        isReadyToServe = readyToServe;
    }
}
