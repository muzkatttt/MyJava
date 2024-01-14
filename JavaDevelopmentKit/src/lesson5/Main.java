package lesson5;


import java.util.concurrent.CountDownLatch;

public class Main {
    private static String bracket;

    public static void main(String[] args) throws InterruptedException {
        /*
        for (int i = 0; i < 3; i++) {
            MyThread thread = new MyThread();
            thread.start();
            //thread.join(); // второй поток будет выполняться строго после первого

        }
        for (int i = 0; i < 5; i++) {
            new Thread(new MyRunnable()).start();
        }
        // создание потоков через лямбда-выражения
        for (int i = 0; i < 3; i++) {
            new Thread(() -> {
                System.out.println("3. Hello from " + Thread.currentThread());
            }).start();

        }
*/
        //задача про TicTac
        Thread tic = new Thread(new TicTac(bracket="[", Thread.currentThread()));
        Thread tac = new Thread(new TicTac(bracket="]", Thread.currentThread()));
        //tic.setDaemon(true); // обозначаем первый поток как сервисный через метод setDaemon();
        tic.start();
        tac.start();

        System.out.println();

        //задача про task, сначала создаем три потока
        long start = System.currentTimeMillis();
        Task task = new Task(0);
        CountDownLatch cdl = new CountDownLatch(3);
        task.setCdl(cdl);
        for (int i = 0; i < 3; i++) {
            Thread thread = new Thread(task);
            thread.start();
        }
        System.out.println(task.getValue());
        long stop = System.currentTimeMillis();
        System.out.println("Time: " + (stop - start) + "ms.");
    }
}
