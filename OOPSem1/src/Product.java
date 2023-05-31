public class Product {
    // Реализуйте класс Товар, содержащий данные о товаре, и ТорговыйАвтомат,
    // содержащий в себе методы initProducts (List <Product>) сохраняющий в себе список
    // исходных продуктов
    private String productName;

    public Product(String productName) {
        this.productName = productName;
    }

    public String getProduct() {
        return productName;
    }

    @Override
    public String toString() {
        return "Product{" + "productName='" + productName + '\'' + '}';
    }
}
