package task5;

public class Ex002_MultiPair {
    public static void main(String[] args) {
        MultiPair<Integer, String> mp1 = new MultiPair<>(123, "str");
        System.out.println(mp1);

        var mp2 = new MultiPair<>(true, false);
        System.out.println(mp2);

    }
}

