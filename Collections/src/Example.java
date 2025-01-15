import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public final class Example {
    private final List<String> myCats;
    private final long myCash;
    private final String[] cups;

    public Example(List<String> myCats, long myCash, String[] cups) {
        this.myCats = Collections.unmodifiableList(myCats);
        this.myCash = myCash;
        this.cups = Arrays.copyOf(cups, cups.length);
    }

    public List<String> getMyCats() {
        return myCats;
    }

    public long getMyCash() {
        return myCash;
    }

    public String[] getCups() {
        return cups;
    }

}
