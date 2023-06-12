package task5;

public class Ex001_Pair {
    public static void main(String[] args) {

        System.out.println("+");
        String s1 = "123";
        String s2 = "qwe";
        Pair<String> pair = new Pair<String>(s1, s2);
        System.out.println(pair.getFirst());
        System.out.println(pair.getSecond());

        pair.swap();

        System.out.println(pair.getFirst());
        System.out.println(pair.getSecond());

    }
}

