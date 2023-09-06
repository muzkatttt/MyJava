package lesson1;

import java.util.ArrayList;
import java.util.List;

public class SimpleSort {

    public static void main(String[] args){
//        List<Integer> availableDivider = findAvailableDivider(35);
//        for (Integer integer : availableDivider){
//            System.out.println(integer);
//        }
        List<Integer> availableSimple = findSimpleNumbers(6);
        for (Integer integer : availableSimple){
            System.out.println(integer);
        }
    }
//    public static List<Integer> findAvailableDivider(int number){
//        List<Integer> result = new ArrayList<>();
//        for (int i = 1; i < number; i++){
//            if (number % i == 0){
//                result.add(i);
//            }
//        }
//        return result;
//    }

    public static List<Integer> findSimpleNumbers(int max){
        // добавим счетчик для счета количества операций
        int counter = 0;
        List<Integer> result = new ArrayList<>();
        for (int i = 1; i <= max; i++){
            boolean simple = true;
            for (int j = 2; j < i; j++){
                counter++;
                if (i % j == 0) simple = false;
                //break; ввод команды break сильно упростить сложность алгоритма
            }
            if (simple){
                result.add(i);
            }
        }
        System.out.println("Counter: " + counter);
        return result;
    }
}
