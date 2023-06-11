import java.util.ArrayList;
import java.util.Iterator;

public class HotDrinkVendingMachine implements Comparable<Price> {

    public ArrayList<HotDrink> priceDrink;
    private int price;

    public HotDrinkVendingMachine(String drink, int volume, int temperature) {
    }

    public Long getPrice() {
        return getPrice();
    }


    public void addPrice(HotDrink hotDrink) {
        priceDrink.add(hotDrink);
    }

    @Override
    public int compareTo(Price o) {
        return Integer.compare(this.price, Integer.parseInt(o.price));
//        if (o.price < this.price) {
//            return 1;
//        } else if (this.price < o.price) {
//            return -1;
//        } else
//            return 0;
    }
}

