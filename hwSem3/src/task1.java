import java.util.ArrayList;
import java.util.List;

public class task1 {
    public static void main(String[] args) {
        /*
        Пусть дан произвольный список целых чисел, удалить из него четные числа.
         */
        List<Integer> myX = randomArray(10, 10, 1);
        System.out.println(myX);
        deleteNumbers(myX);
        System.out.println(myX);
    }

    public static List<Integer> randomArray(int size, int max, int min) {
        List<Integer> list = new ArrayList<>(size);
        for (int i = 0; i < size; i++){
            list.add((int)(Math.random()*(max - min + 1) + min));
        }
        return list;
    }

    static void deleteNumbers(List<Integer> list){
        list.removeIf(i -> i % 2 == 0);
    }
}