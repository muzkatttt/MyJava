import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        /*
        ArrayList<Integer> numbers = new ArrayList<>(3);
        numbers.add(1);
        numbers.add(1, 3);
        numbers.add(5);
        ArrayList<String> sort = new ArrayList<>();
        System.out.println(Arrays.toString(numbers.toArray()));
        sort.add(0, "Лети");
        sort.add(1, "выше");
        sort.add(2, "неба");
//        System.out.print ((sort.set(0, " ") + " "));
//        System.out.print((sort.set(1, " ") + " "));
//        System.out.print(sort.set(2, " "));

        System.out.println(sort);
        for(Integer el : numbers) {
            System.out.println(el);
        }
        for(String el: sort){
            System.out.println(el);
        }
         */
        LinkedList<Float> ll = new LinkedList<>();
        ll.add(1.2f);
        ll.push(2.1f);
        ll.add(0.9f);
        System.out.println(ll.stream().sorted());
    }
}