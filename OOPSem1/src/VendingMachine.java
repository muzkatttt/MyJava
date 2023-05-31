import java.util.LinkedList;

public class VendingMachine {
    private LinkedList<Product> products;

    public VendingMachine() {
        this.products = new LinkedList<>();
    }

    public void putProduct(Product item) {
        this.products.addFirst(item);
    }

    public Product getProduct() {
        return this.products.getLast();
    }



    @Override
    public String toString() {
        return "VendingMachine{" + "products=" + products + '}';
    }
}

