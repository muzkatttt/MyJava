
public class HotDrink extends AllDrink {
    protected String drink;
    protected int volume;
    protected int temperature;

    public HotDrink(String drink, int volume, int temperature) {
        this.drink = drink;
        this.volume = volume;
        this.temperature = temperature;
    }

    public String getDrink() {
        return drink;
    }

    public Integer getPrice() {
        return price;
    }

    public void setDrink(String drink) {
        this.drink = drink;
    }

    public HotDrink(String drink, int price, int volume, int temperature) {
        super.drink = drink;
        this.price = price;
        this.volume = volume;
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }

    @Override
    public String toString() {
        return "drink " + super.getDrink() + " price " + price + " volume " + volume +
                " temperature " + temperature + ".";
    }

}

