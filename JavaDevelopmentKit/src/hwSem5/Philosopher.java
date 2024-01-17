package hwSem5;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Philosopher extends Thread {

    // region Поля
    private final Fork leftFork;
    private final Fork rightFork;

    // endregion

    // region Конструкторы
    public Philosopher(Fork leftFork, Fork rightFork) {
        this.leftFork = leftFork;
        this.rightFork = rightFork;
    }

    // endregion

    // region Методы

    /**
     * Метод, заставляющий философа думать случайное время
     * @throws InterruptedException
     */
    public void think() throws InterruptedException {
        Thread.sleep((int) Math.random() * 1000);
    }

    /**
     * Метод, заставляющий философа действовать
     * @param active действие
     * @throws InterruptedException
     */
    public void stepAction(String active) throws InterruptedException {
        System.out.println(Thread.currentThread().getName() + " " + active);
        Thread.sleep(((int) (Math.random() * 999)));
    }

    /**
     * Метод, запускающий действия философа
     */
    @Override
    public void run() {
        int count = 0;
        try {
            while (true) {
                while (count < 3) {
                    // думает
                    think();
                    stepAction(LocalDateTime.now().format(DateTimeFormatter.ISO_TIME)
                            + " минут -> думает ...");

                    //берет левую вилку
                    synchronized (leftFork) {
                        stepAction(LocalDateTime.now().format(DateTimeFormatter.ISO_TIME)
                                + " минут -> взял левую вилку.");
                        Thread.sleep((int) (Math.random() * 50));

                        synchronized (rightFork) {
                            // взял правую вилку
                            stepAction(LocalDateTime.now().format(DateTimeFormatter.ISO_TIME)
                                    + " минут -> взял правую вилку, ест спагетти.");

                            // ест спагетти
                            stepAction(LocalDateTime.now().format(DateTimeFormatter.ISO_TIME)
                                    + " минут -> положил правую вилку на место.");
                        }

                        // погружается в мыслительный процесс
                        stepAction(LocalDateTime.now().format(DateTimeFormatter.ISO_TIME)
                                + " минут -> положил левую вилку, погрузился в размышления.");
                    }
                    count++;
                    System.out.println(Thread.currentThread().getName() + " поел " + count + " раз(-а)!");
                }
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
        // endregion
}

