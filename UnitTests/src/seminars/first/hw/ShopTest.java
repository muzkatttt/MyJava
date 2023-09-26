package seminars.first.hw;

import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ShopTest {

    /*
     1. Проверить, что магазин хранит верный список продуктов (количество продуктов, состав корзины)
     2. Проверить, что магазин возвращает верный самый дорого продукт getMostExpensiveProduct
     3. Проверить, что магазин возвращает верный отсортированный по цене список продуктов
    */
    public static void main(String[] args) {
        Product productFromBasket0 = new Product(25, "ProductFromBasket0");
        Product productFromBasket1 = new Product(100, "ProductFromBasket1");
        Product productFromBasket2 = new Product(20, "ProductFromBasket2");
        Product productFromBasket3 = new Product(5, "ProductFromBasket3");
        Product productFromBasket4 = new Product(35, "ProductFromBasket4");

        System.out.println(new Product(25, "ProductFromBasket0"));
        System.out.println(new Product(100, "ProductFromBasket1"));
        System.out.println(new Product(20, "ProductFromBasket2"));
        System.out.println(new Product(5, "ProductFromBasket3"));
        System.out.println(new Product(35, "ProductFromBasket4"));

        Shop shop = new Shop();

        shop.add(new Product(25, "ProductFromBasket0"));
        shop.add(new Product(100, "ProductFromBasket1"));
        shop.add(new Product(20, "ProductFromBasket2"));
        shop.add(new Product(5, "ProductFromBasket3"));
        shop.add(new Product(35, "ProductFromBasket4"));

        System.out.println(shop.getSortedListProducts());
        System.out.println();
        System.out.println(shop.getMostExpensiveProduct());

        // Проверка ожидаемого исключения с использованием утверждений AssertJ:
        // магазин хранит верный список продуктов (количество продуктов, состав корзины)
        assertThat(shop.getProducts().contains(productFromBasket0));
        assertThat((shop.getProducts().contains(productFromBasket1)));
        assertThat((shop.getProducts().contains(productFromBasket2)));
        assertThat((shop.getProducts().contains(productFromBasket3)));
        assertThat((shop.getProducts().contains(productFromBasket4)));

        // магазин возвращает верный самый дорогой продукт из метода getMostExpensiveProduct
        assertThat(shop.getMostExpensiveProduct().getCost()).isEqualTo(100);

        //магазин возвращает верный отсортированный по цене список продуктов
        assertThat(shop.getSortedListProducts());
    }
}





