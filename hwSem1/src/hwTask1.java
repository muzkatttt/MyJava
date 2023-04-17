/* Вычислить n-ое треугольного число (сумма чисел от 1 до n)
 */

public class hwTask1 {
    public static void main(String[] args) {
        int sum = 0;
        int hight = 1;
        int temp = 0;
        for (int i = 1; i <= hight; i++) {
            temp = (1 / 2) * i * (i + 1);
            sum +=temp;
            System.out.println(temp);
        }
    }
    public static void enterNums(String[] args) {
        System.out.println(args);
    }
}