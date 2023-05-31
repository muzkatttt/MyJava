public class HotDrinkTee extends HotDrink {

    protected boolean syrup;

    public HotDrinkTee(String drink, Integer price, boolean syrup, int temperature) {
        super(drink, price, temperature);
        this.syrup = syrup;
    }
}
