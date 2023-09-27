package sem3.task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main {
    public static void main(String[] args) {
        try (Counter counter = new Counter(1)) {
            System.out.println(counter.isOpen() + " " +counter.getCount());
            counter.add();
            System.out.println(counter.isOpen() + " " +counter.getCount());
            counter.close();
            counter.add();
            System.out.println(counter.isOpen() + " " +counter.getCount());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
