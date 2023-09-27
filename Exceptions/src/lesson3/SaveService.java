package lesson3;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public class SaveService {
    public void save() throws SavedException {
        Date date = new Date();
        System.out.println("save document file...");
        try(FileWriter writer = new FileWriter("test")){
            throw new IOException("operation failed");
        } catch (IOException e) {
            System.out.println(e.getMessage());
            throw new SavedException("Saved failed", date, e);
        }
    }
}
