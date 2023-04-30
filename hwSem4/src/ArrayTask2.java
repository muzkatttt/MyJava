import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayTask2 {
    ArrayList<Integer> array = new ArrayList<>();

    Array addArray(int item) {
        array.add(0, item);
        return null;
    }
}

//    public static int first(LinkedList<Integer> ll) { // возвращает первый элемент из очереди, не удаляя
//        int num = ll.get(0);
//        return num;
//    }


