import java.util.Comparator;

public class PriceComparator implements Comparator<HotDrink> {

    private long price;

    @Override
    public int compare(HotDrink o1, HotDrink o2) {
        return Long.compare(o1.price, o2.price);
    }


    @Override
    public String toString() {
        return "PriceComparator{" +
                "price=" + price +
                '}';
    }
}
