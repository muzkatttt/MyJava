import java.util.List;

public class HotDrink extends AllDrink implements VendingMachine {
    protected String drink;
    protected int volume;
    protected int temperature;
    protected Long price;
    protected List<HotDrink> priceDrink;

    public HotDrink(String drink, int volume, int temperature) {
        this.drink = drink;
        this.volume = volume;
        this.temperature = temperature;
    }

    public HotDrink(String drink, Long price, int volume, int temperature) {
        this.drink = drink;
        this.price = price;
        this.volume = volume;
        this.temperature = temperature;
    }

    @Override
    public String getHotDrinks() {
        return drink;
    }


    public String getDrink() {
        return drink;
    }

    public Long getPrice() {
        return price;
    }

    public Integer getVolume() {
        return volume;
    }

    public Integer getTemperature() {
        return temperature;
    }

    public void addDrink(List<String> priceDrink){
        priceDrink.add(drink);
    }

    @Override
    public String toString() {
        return "Напиток " + drink + ", цена " + price + ", объем " + volume + " ml," +
                " температура " + temperature + ".";
    }
}


