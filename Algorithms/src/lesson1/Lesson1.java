package lesson1;

import java.util.ArrayList;
import java.util.List;

public class Lesson1 {

    public static void main(String[] args){
//        List<Integer> availableDivider = findAvailableDivider(35);
//        for (Integer integer : availableDivider){
//            System.out.println(integer);
//        }
        List<Integer> availableSimple = findSimpleNumbers(100);
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
        List<Integer> result = new ArrayList<>();
        for (int i = 1; i <= max; i++){
            boolean simple = true;
            for (int j = 2; j < i; j++){
                if (i % j == 0) simple = false;
            }
            if (simple){
                result.add(i);
            }
        }
        return result;
    }
}
