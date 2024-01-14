package lesson5;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Queue<Task> queue = new ArrayDeque<>();

        // блокирующий режим убивает выполнение задач
        ExecutorService executor = Executors.newFixedThreadPool(2);
        Thread taskService = new Thread(() -> {
            while (true) {
                try {
                    Thread.sleep(10000);
                    // извлечение последнего элемента из одного потока:
                    //Task task = queue.poll();
                    //if (task != null) {
                    //System.out.println("Task" + task + " started");
                    //executor.submit(task);// извлечение элемента из одного потока
                    executor.submit(() -> {
                        Task task = queue.poll();
                        System.out.println("Task " + task + " started");
                        if (task != null) {
                            System.out.println("Task " + task + " started");
                            task.run();
                        }
                    });
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        taskService.start();
        //executor.shutdown(); //выключить режим

        while (in.hasNextLine()) {
            // 2 + 2
            try {
                String[] tokens = in.nextLine().split(" ");
//                int left = Integer.parseIn t(tokens[0]);
//                int right = Integer.parseInt(tokens[1]);
                int value = Integer.parseInt(in.nextLine().trim());
                //Task task = new Task(left, right);
                Task task = new Task(value);
                queue.add(task);
            } catch (Exception e){
                e.printStackTrace();
        }
    }

}

    @Override
    public String toString() {
        return String.format("(%s+%s)");
    }
}
