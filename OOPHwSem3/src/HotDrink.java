import java.util.List;

public class HotDrink extends AllDrink implements Comparable<HotDrink> {

    protected int temperature;

    public HotDrink(String drink, Long price, int volume, int temperature) {
        super(drink, price, volume);
        this.temperature = temperature;
    }

    public String getDrink() {
        return drink;
    }

    public Integer getVolume() {
        return volume;
    }

    public Integer getTemperature() {
        return temperature;
    }

    public Long getPrice() {
        return price;
    }


    public void setDrink(String drink) {
        this.drink = drink;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public void setPrice(Long price) {
        this.price = price;
    }


    @Override
    public int compareTo(HotDrink o) {
        if (o.getPrice() < this.getPrice()) {
            return 1;
        } else if (this.getPrice() < o.getPrice()) {
            return -1;
        } else
            return 0;
    }

    @Override
    public String toString() {
        return "Напиток " + getDrink() +
                ", объем " + getVolume() +
                ", температура " + getTemperature() +
                ", цена " + getPrice() +
                ".";
    }
}


