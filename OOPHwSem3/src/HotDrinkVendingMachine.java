import java.util.ArrayList;

public class HotDrinkVendingMachine extends HotDrink implements Comparable<Price> {

    public ArrayList<HotDrink> priceDrink;
    private long price;

    public HotDrinkVendingMachine(String drink, int volume, int temperature, long price) {
        super(drink, volume, temperature);
        this.price = price;
    }

    public Long getPrice() {
        return getPrice();
    }

    public void addPrice(HotDrink hotDrink) {
        priceDrink.add(hotDrink);
    }

    @Override
    public int compareTo(Price o) {
        return Long.compare(this.price, o.price);
//        if (o.price < this.price) {
//            return 1;
//        } else if (this.price < o.price) {
//            return -1;
//        } else
//            return 0;
    }
}

