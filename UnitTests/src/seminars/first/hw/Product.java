package seminars.first.hw;

public class Product {
    private int cost; // Стоимость продукта
    private String title; // Название продукта
    public Product(){
        this.cost = 0;
        this.title = "";
    }

    public  Product(int cost, String title){
        this.cost = cost;
        this.title = title;
    }
    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Product: " + this.cost + " rub. Title: " + this.title + ".";
    }
}