public interface VendingMachine {
    String getHotDrinks();

    abstract String getDrink();

    abstract Long getPrice();

    abstract Integer getVolume();

    abstract Integer getTemperature();
}

