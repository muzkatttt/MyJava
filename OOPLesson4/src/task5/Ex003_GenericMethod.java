package task5;

import java.util.Random;

class Ex003_GenericMethod {
    public static void main(String[] args) {
        System.out.println(GenericMethod.<String>Swap("str1", "str2"));
        System.out.println(GenericMethod.Swap(100, 200));
        System.out.println(GenericMethod.Swap(true, false));

    }
}

