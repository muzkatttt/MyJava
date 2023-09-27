package seminars.second.hw;

public class Vehicle extends VehicleAbstract {
    //Базовый класс ""Vehicle"" содержит методы ""testDrive()"" и ""park()"",
    //      а также поля ""company"", ""model"", ""yearRelease"", ""numWheels"" и ""speed"".

    private String company;
    private String model;
    private int yearRelease;
    private int numWheels;
    private int speed;

    public Vehicle() {
        this.company = company;
        this.model = model;
        this.speed = speed;
        this.yearRelease = yearRelease;
        this.numWheels = numWheels;


    }

    @Override
    public void testDrive() {

    }

    @Override
    public void park() {

    }
}
