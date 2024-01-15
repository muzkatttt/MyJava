package hwSem5;

public class Philosopher implements Runnable {
    private final Fork leftFork;
    private final Fork rightFork;

    public Philosopher(Fork leftFork, Fork rightFork) {
        this.leftFork = leftFork;
        this.rightFork = rightFork;
    }

    public void think() throws InterruptedException {
        wait((long) Math.random() * 10);
    }

    public void stepAction(String active) throws InterruptedException {
        System.out.println(Thread.currentThread().getName() + " " + active);
        Thread.sleep(((int) (Math.random() * 500)));
    }

    @Override
    public void run() {
        try {
            while (true) {
                //think();
                // думает
                stepAction(System.nanoTime() + ": философ думает");
                //берет левую вилку
                synchronized (leftFork) {
                    stepAction(System.nanoTime() + ": взял левую вилку");
                    Thread.sleep((int) (Math.random() * 50));
                    synchronized (rightFork) {
                        // взял правую вилку
                        stepAction(System.nanoTime() + ": взял правую вилку, ест спагетти");
                        // ест спагетти
                        stepAction(System.nanoTime() + " положил правую вилку на место");
                    }
                    // погружается в мыслительный процесс
                    stepAction(System.nanoTime() + " положил левую вилку, погрузился в размышления");
                }
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            //return;
        }
    }
}

