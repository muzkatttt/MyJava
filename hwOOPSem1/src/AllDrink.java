
public abstract class AllDrink {

    protected String drink;
    protected Integer price;

    public String AllDrink(String drink, Integer price) {
        this.drink = drink;
        this.price = price;
        return drink + price;
    }

    public String getDrink() {
        return drink;
    }
    public Integer getPrice(){
        return price;
    }
}

