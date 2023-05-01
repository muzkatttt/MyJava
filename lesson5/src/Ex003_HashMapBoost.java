
import java.util.*;

public class Ex003_HashMapBoost {
    public static void main(String[] args) {
        // если в скобках не указываются аргументы - это значит, что объем памяти для хранения не фиксирован
        // если есть аргументы, то значит, что задано начальное значение объема памяти
        // если указано два аргумента, то значит у нас есть начальное значение и конечное, при заполнении
        // которого будет удвоено хранилище
        Map<Integer,String> map1 = new HashMap<>();
        Map<Integer,String> map2 = new HashMap<>(30);
        Map<Integer,String> map3 = new HashMap<>(30, 0.8f); // 0.8f = 80% 1.0f = 100%
    }
}