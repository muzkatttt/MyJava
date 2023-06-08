import java.util.ArrayList;
import java.util.Iterator;

public class HotDrinkVendingMachine implements Comparable<HotDrink>, Iterable<Price> {

    public ArrayList<HotDrink> priceDrink;

    public HotDrinkVendingMachine(String drink, int volume, int temperature) {

    }

    public Long getPrice(){
        return getPrice();
    }

    @Override
    public int compareTo(HotDrink o) {
        return 0;
    }

    @Override
    public Iterator<Price> iterator() {
        return null;
    }
    public void addPrice(HotDrink hotDrink){
        priceDrink.add(hotDrink);
    }
}

