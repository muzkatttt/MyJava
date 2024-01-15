package lesson5;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedDeque;

public class CME {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Queue<Integer> list1 = new ConcurrentLinkedDeque<>(); // блокировка связного списка
        for (int i = 0; i<100; i++){
            list.add(i);
        }
        Runnable r1 = () -> {
                for (int i = 0; i < 100; i++) {
                    synchronized (list) {
                        list.add(i);
                    }
                }
        };
        Runnable r2 = () -> {
            synchronized (list) {
                for (Integer value : list) {
                    System.out.print(value + " ");
                }
            }
        };
        new Thread(r1).start();
        new Thread(r2).start();
    }
}
