package sem1;

public class Sem1 {
    public static void main(String[] args) throws InterruptedException {

        int n = 5000;
        SimpleNums(n);
        SimpleNums2(n);

        long start1 = System.nanoTime();
        SimpleNums(n);
        long end1 = System.nanoTime();
        long start2 = System.nanoTime();
        SimpleNums2(n);
        long end2 = System.nanoTime();

        System.out.println((end1 - start1) + " ns");
        System.out.println((end2 - start2) + " ns");

        System.out.println(Sum(15));
        System.out.println();
        System.out.println(Sum2(15));

    }

    public static void SimpleNums(int n) { // Все простые числа от 1 до n   n*(n+1)/2
        for (int i = 2; i <= n; i++) {
            boolean isSimple = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isSimple = false;
                    break;
                }
            }
            if (isSimple)
                System.out.print(i + " ");
        }
        System.out.println();
    }
    public static void SimpleNums2(int n) { // Все простые числа от 1 до n
        for (int i = 2; i <= n; i++) {
            boolean isSimple = true;
            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    isSimple = false;
                    break;
                }
            }
            if (isSimple)
                System.out.print(i + " ");
        }
        System.out.println();
    }


    public static int Sum(int n) { // Сумма чисел от 1 до n (включительно)  O(n)
        int sum = 0;
        for (int i = 1; i <= n; i++)
            sum += i;
        return sum;
    }

    public static int Sum2(int n) { // Сумма чисел от 1 до n (включительно) O(1)
        return n * (n + 1) / 2;
    }
}
