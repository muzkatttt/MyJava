public interface VendingMachine {
    String getHotDrinks();

    abstract String getDrink();

    abstract Integer getPrice();

    abstract Integer getVolume();

    abstract Integer getTemperature();
}

