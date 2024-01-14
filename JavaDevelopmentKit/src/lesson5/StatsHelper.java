package lesson5;

import java.util.Scanner;

public class StatsHelper {
    public static int cnt = 0;
    public static void main(String[] args) throws InterruptedException {
        Thread readThread = new Thread(() -> {
            Scanner in = new Scanner(System.in);
            while (in.hasNextLine() && !Thread.interrupted()) {
                in.nextLine();
                cnt++;
            }
        });
        readThread.setDaemon(true);
        readThread.start();
        readThread.interrupt();

        while (true){
            System.out.println(cnt + " messages inputed by user");
            Thread.sleep(1000);
        }
    }
}
