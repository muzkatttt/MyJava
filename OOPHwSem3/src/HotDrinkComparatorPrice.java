import java.util.Comparator;

public class HotDrinkComparatorPrice implements Comparator<HotDrink> {

    @Override
    public int compare(HotDrink o1, HotDrink o2) {
        return Long.compare(o1.getPrice(), o2.getPrice());
    }

}
