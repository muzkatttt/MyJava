public class Motorcycle extends Venicle {
    /*
     Класс ""Motorcycle"" расширяет ""Vehicle"" и реализует его абстрактные методы.
     При создании объекта ""Motorcycle"", число колес устанавливается в 2, а скорость в 0.
     В методе ""testDrive()"" скорость устанавливается на 75, а в методе ""park()"" - обратно в 0.
     */
    private String company;
    private String model;
    private int yearRelease;
    private int numWheels;
    private int speed;

    public Motorcycle(String company, String model, int year) {
        this.company = company;
        this.model = model;
        this.yearRelease = year;
        this.numWheels = 2;
        this.speed = 0;
    }
    public void testDrive() {
        this.speed = 75;
    }
    public void park() {
        this.speed = 0;
    }
    public String getCompany() {
        return company;
    }
    public String getModel() {
        return model;
    }
    public int getYearRelease() {
        return yearRelease;
    }
    public int getNumWheels() {
        return numWheels;
    }
    public int getSpeed() {
        return speed;
    }
    public String toString() {
        return "This motorcycle is a “ + getYearRelease + “ “ + make + “ “ + model + “;";
    }
}
