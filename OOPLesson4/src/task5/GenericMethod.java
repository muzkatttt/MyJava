package task5;

import java.util.Random;

class GenericMethod {
    static Random random = new Random();

    public static <T> T Swap(T arg1, T arg2) {
        int t = random.nextInt(2);
        return t == 0 ? arg1 : arg2;
        // var res = arg1+arg2;
    }
}
