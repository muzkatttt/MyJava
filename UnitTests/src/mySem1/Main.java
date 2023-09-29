package mySem1;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;

import static org.assertj.core.api.ClassBasedNavigableIterableAssert.assertThat;

public class Main {
    public static void main(String[] args) {
        // Проверьте, как работают методы:

        // assertConditionA();

        // assertConditionB();

        // System.out.println(sum(2_147_483_647, 1));

        // happyNY();

        // expectedValue();

        // checkingShoppingCart()

        /*
                assertThat(colors)
                        .isNotEmpty()             // Массив не должен быть пустым
                        .hasSize(7)               // Размер массива должен быть равен 7
                        .doesNotHaveDuplicates()  // Массив не должен содержать повторяющихся элементов
                        .contains("orange", "green", "violet") // Массив должен содержать цвета: "orange", "green", "violet"
                        .endsWith("gold")        //  Последним цветом в массиве должен быть "gold"
                        .startsWith("aqua")     // Первым цветом в массиве должен быть "aqua"
                        .containsSequence("yellow", "blue") // В массиве должна быть последовательность цветов "yellow", "blue"
                        .doesNotContain("red", "black");    //Массив не должен содержать цвета: "red", "black"
        */

        //  String[] colors = {};

        //  testingJavaCollectionsAssertJ(colors);

        //  checkingHero();
        checkingShoppingCart();
    }

    //                  Практические задания:
    // 1.1
    public static void assertConditionA() {
        String[] weekends = {"Суббота", "Воскресенье"};
        assert weekends.length == 3;
        System.out.println("В неделе " + weekends.length + " дня выходных");
    }

    // 1.2
    public static void assertConditionB() {
        int x = -1;
        assert x >= 0;
    }

    // 1.3
    // assert boolean_выражение : сообщение_об_ошибке;
    // Ariane V - https://habr.com/ru/company/pvs-studio/blog/306748/
    // sum(2_147_483_647, 1) возвращает "-2147483648"
    public static int sum(int a, int b) {
        return a + b;
    }

    // 1.4
    // 08/12/2022 06:19:41
    // windows fail - https://habr.com/ru/company/pvs-studio/blog/698404/
    public static void happyNY() {
        Calendar calendar = Calendar.getInstance();
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        String currentDateTime = dateFormat.format(calendar.getTime());

        assert currentDateTime.equals("01/01/2023 00:00:00") : "Еще 2023 год :(";
        System.out.println("С новым годом!");
    }

    // 1.5
    // выражение assert верно, нужно исправить код
    // Вот наиболее распространенный вариант использования. Предположим, вы включаете значение enum:
    public static void checkingShoppingCart() {
        ArrayList<String> productCategories = new ArrayList<>();
        productCategories.add("fruits");
        productCategories.add("vegetables");
        productCategories.add("bakery");

        ArrayList<String> products = new ArrayList<>();
        products.add("apple");
        products.add("tomato");
        products.add("bread");
        products.add("water");

        for (String product : products) {
            if (product.equals("apple")) {
                System.out.println("category: " + productCategories.get(0));
            } else if (product.equals("tomato")) {
                System.out.println("category: " + productCategories.get(1));
            } else if (product.equals("bread")) {
                System.out.println("category: " + productCategories.get(2));
            } else {
                assert false : "Unknown category for the product " + product;
            }
        }
    }

    // 1.6
    //   AssertJ
    // ok - assertThat(actual/фактическое).isEqualTo(expected/ожидаемое);
    // not ok - assertThat(expected/ожидаемое).isEqualTo(actual/фактическое);
    public static void expectedValue() {
        //assertThat(3).isEqualTo(sum(2, 3));
    }

    // 1.7
//    public static void testingJavaCollectionsAssertJ(String[] colors) {
//        assertThat("colors")
//                .isNotEmpty()             // Массив не должен быть пустым
//                .hasSize(7)      // Размер массива должен быть равен 7
//                .doesNotHaveDuplicates() // Массив не должен содержать повторяющихся элементов
//                .contains("orange", "green", "violet") // Массив должен содержать цвета: "orange", "green", "violet"
//                .endsWith("gold")   //  Последним цветом в массиве должен быть "gold"
//                .startsWith("aqua")     // Первым цветом в массиве должен быть "aqua"
//                .containsSequence("yellow", "blue")      // В массиве должна быть последовательность цветов "yellow", "blue"
//                .doesNotContain("red", "black"); //Массив не должен содержать цвета: "red", "black"
//    }

    // 1.8
    public static void checkingHero() {

        List<String> heroBag = Arrays.asList("Bow", "Axe", "Gold");
        Hero emmett = new Hero("Emmett", 50, "sword", heroBag, true);

        /*
        1. Проверить, что герой создался с именем Emmett
        2. Проверить, что значение прочности брони героя равно 50
        3. Проверить, что у героя оружие типа sword
        4. Проверить содержимое инвентаря героя (не пустой, размер 3, содержимое "Bow", "Axe", "Gold", порядок не важен)
        5. Проверить, что герой человек (свойство true)
        */

        // assert "Emmett".equals(emmett.getName()): "Name should be Emmett";
        // Далее продолжите сами ...

    }

    // 1.8 (Черный ящик)
    static class Hero {
        private String name;
        private int armorStrength;
        private String weapon;
        private List<String> bag;
        private boolean isHuman;

        public Hero(String name, int armorStrength, String weapon, List<String> bag, boolean isHuman) {
            this.name = name;
            this.armorStrength = armorStrength;
            this.weapon = weapon;
            this.bag = bag;
            this.isHuman = isHuman;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getArmorStrength() {
            return armorStrength;
        }

        public void setArmorStrength(int armorStrength) {
            this.armorStrength = armorStrength;
        }

        public String getWeapon() {
            return weapon;
        }

        public void setWeapon(String weapon) {
            this.weapon = weapon;
        }

        public List<String> getBag() {
            return bag;
        }

        public void setBag(List<String> bag) {
            this.bag = bag;
        }

        public boolean isHuman() {
            return isHuman;
        }

        public void setHuman(boolean human) {
            isHuman = human;
        }
    }
}
