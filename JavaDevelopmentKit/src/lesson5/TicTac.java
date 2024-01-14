package lesson5;

public class TicTac implements Runnable {
    private final String bracket;
    private final Object monitor;

    public TicTac(String bracket, Object monitor) {
        this.bracket = bracket;
        this.monitor = TicTac.class;
    }

//    public TicTac(String bracket) {
//        this.bracket = bracket;
//    }

    @Override
    public void run() {
        while (true) {
            synchronized (monitor) {
                System.out.print(bracket);
                monitor.notify();
                try {
                    Thread.sleep(500);
                    monitor.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

}
