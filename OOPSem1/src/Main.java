public class Main {
    public static void main(String[] args) {
        //Реализуйте класс Товар, содержащий данные о товаре, и ТорговыйАвтомат,
        // содержащий в себе методы initProducts (List <Product>)
        // сохраняющий в себе список исходных продуктов и getProduct(String name)
        VendingMachine vendingMachine = new VendingMachine();
        vendingMachine.putProduct(new Product("Snickers"));
        vendingMachine.putProduct(new Product("Mars"));
        vendingMachine.putProduct(new Product("Bounty"));
        vendingMachine.putProduct(new Product("Twix"));
        System.out.println(vendingMachine);
        System.out.println(vendingMachine.getProduct());
        System.out.println(vendingMachine.getProduct());
        System.out.println(vendingMachine);

        Cat cat = new Cat("Barsik", 4);
        System.out.println(cat);

    }
}

