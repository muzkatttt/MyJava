package lesson3;

import java.io.IOException;
import java.util.Date;

public class SavedException extends IOException {
    private Date startDate;
    public SavedException(String message, Date startDate, Exception e) {
        super(message, e);
    }
}
