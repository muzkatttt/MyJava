package models;

public class Coffee extends HotDrink{
    private String brand;
    private String sort;


    public Coffee(int temperature, int cost, int id, boolean isReadyToServe, String brand, String sort) {
        super(temperature, cost, id, isReadyToServe);
        this.brand = brand;
        this.sort = sort;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    @Override
    public String toString() {
        return "Coffee{" +
                "brand='" + brand + '\'' +
                ", sort='" + sort + '\'' +
                ", temperature=" + temperature +
                ", cost=" + cost +
                ", id=" + id +
                '}';
    }
}
