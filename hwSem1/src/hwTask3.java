
public class hwTask3 {
    /*
    Вывести все простые числа от 1 до 1000 (числа, которые делятся только на 1 и на себя без остатка)
     */
    public static void checkingNumber() {
        System.out.println(2);
        for (int i = 3; i < 1000; i++) {
            boolean check = true;
            for (int j = 2; j < i / 2 + 1; j++) {
                if (i % j == 0) {
                    check = false;
                    break;
                }
            }
            if (check) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        checkingNumber();
    }
}
