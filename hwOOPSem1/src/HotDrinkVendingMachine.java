import java.util.LinkedList;

public class HotDrinkVendingMachine implements VendingMachine {
    private LinkedList<HotDrink> myDrinks;

    public HotDrinkVendingMachine(LinkedList<HotDrink> myDrinks) {
        this.myDrinks = myDrinks;
    }

    @Override
    public HotDrink getHotDrinks() {
        return getHotDrinks();
    }

    @Override
    public String toString() {
        return "HotDrink " +
                "hotDrink " + myDrinks +
                " ";
    }
}

