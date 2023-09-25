package seminars.first;

import seminars.first.model.Hero;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class Main {


    public static void main(String[] args) {
        assertConditionA();

        assertConditionB();

        System.out.println(sum(2_147_483_647, 2));

        happyNY();

        expectedValue();

        checkingShoppingCart();

        String[] colors = {"...", "...",};
        testingJavaCollectionsAssertJ(colors);

        List<String> heroBag = Arrays.asList("Bow", "Axe", "Gold");
        Hero emmett = new Hero("Emmett", 50, "sword", heroBag, true);
        checkingHero(emmett);
    }

    /**
     * 1) Нужно найти и исправить ошибку в условиях assert
     */
    public static void assertConditionA() {
        String[] weekends = {"Суббота", "Воскресенье"};
        assert weekends.length == 3;
        System.out.println("В неделе " + weekends.length + " дня выходных");
    }

    /**
     * 2) Нужно найти и исправить ошибку в условиях assert
     */
    public static void assertConditionB() {
        int x = -1;
        if (x < 0) throw new AssertionError();
    }

    /**
     * 3) Нужно, используя данную функцию, попробовать сложить два следующих числа
     * 2_147_483_647 и 1, написать assert если нужно
     * (https://habr.com/ru/company/pvs-studio/blog/306748/)
     *
     * @param a первое число
     * @param b второе число
     * @return сумму переданных чисел
     * @apiNote assert boolean_выражение : сообщение_об_ошибке;
     */
    public static int sum(int a, int b) {
        return a + b;
    }

    /**
     * 4) Нужно найти и исправить ошибку в условиях assert
     * windows fail - https://habr.com/ru/company/pvs-studio/blog/698404/
     */
    public static void happyNY() {
        Calendar calendar = Calendar.getInstance();
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        String currentDateTime = dateFormat.format(calendar.getTime());

        // Получили строку currentDateTime в формате "09/12/2022 20:20:04"

        assert currentDateTime.equals("01/01/2023 00:00:00") : "Еще 2022 год :(";
        System.out.println("С новым годом!");
    }

    /**
     * 5) Утверждение предупреждает об ошибке, нужно исправить код, чтобы утверждение не выбрасывало ошибку
     */
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

    /**
     * 6) Найдите ошибку
     */
    public static void expectedValue() {
        assertThat(5).isEqualTo(sum(2, 3));
    }

    /**
     * Нужно передать в метод массив, который соответствует условиям в утверждении
     *
     * @param colors массив с цветами
     */
    public static void testingJavaCollectionsAssertJ(String[] colors) {
        assertThat(colors)
                .isNotEmpty()
                .hasSize(7)
                .doesNotHaveDuplicates()
                .contains("orange", "green", "violet")
                .endsWith("gold")
                .startsWith("aqua")
                .containsSequence("yellow", "blue")
                .doesNotContain("red", "black");
    }

    /**
     * 8) Удовлетворить всем условиям: <p>
     * 1. Проверить, что герой создался с именем Emmett<p>
     * 2. Проверить, что значение прочности брони героя равно 50<p>
     * 3. Проверить, что у героя оружие типа sword<p>
     * 4. Проверить содержимое инвентаря героя (размер 3, содержимое "Bow", "Axe", "Gold", порядок не важен)<p>
     * 5. Проверить, что герой это человек (свойство isHuman)<p>
     */
    public static void checkingHero(Hero hero) {
    }

}