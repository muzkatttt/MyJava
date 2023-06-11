import java.util.List;

public interface VendingMachine {

    Long getPrice(String drink);

    void addDrink(String drink, Long price, int volume);

    HotDrink getHotDrink(String drink, int temperature);

    List<HotDrink> myList();

}

