public class Car extends Venicle{
    /*
    подкласс ""Car"" класса Venicle
    Класс ""Car"" расширяет ""Vehicle"" и реализует его абстрактные методы.
    При создании объекта ""Car"", число колес устанавливается в 4, а скорость в 0.
    В методе ""testDrive()"" скорость устанавливается на 60, а в методе ""park()"" - обратно в 0.
     */
    private String company;
    private String model;
    private int yearRelease;
    private int numWheels;
    private int speed;

    public Car(String company, String model, int year) {
        this.company = company;
        this.model = model;
        this.yearRelease = year;
        this.numWheels = 4;
        this.speed = 0;
    }

    public void testDrive() {
        this.speed = 60;
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
        return "This car is a " + getCompany() + ", year " + getYearRelease() +
                ", model " + getModel() + ";";
    }
}
