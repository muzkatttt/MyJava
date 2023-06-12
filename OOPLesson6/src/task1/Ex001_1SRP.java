package task1;

public class Ex001_1SRP {
    public static void main(String[] args) {
        Planner revengePlanner = new Planner();
        revengePlanner.addEntry("1");
        revengePlanner.removeEntry(0);
        revengePlanner.saveAllText("path");
        revengePlanner.loadFromDB("10.0.0.0", "admin", "1234");
    }
}
