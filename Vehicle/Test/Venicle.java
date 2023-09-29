public abstract class Venicle {
     /*
      абстрактный базовый класс ""Vehicle"" и два его подкласса ""Car"" и ""Motorcycle"".
      Базовый класс ""Vehicle"" содержит абстрактные методы ""testDrive()"" и ""park()"",
      а также поля ""company"", ""model"", ""yearRelease"", ""numWheels"" и ""speed"".
      Класс ""Car"" расширяет ""Vehicle"" и реализует его абстрактные методы.
      При создании объекта ""Car"", число колес устанавливается в 4, а скорость в 0.
      В методе ""testDrive()"" скорость устанавливается на 60, а в методе ""park()"" - обратно в 0.
      Класс ""Motorcycle"" также расширяет ""Vehicle"" и реализует его абстрактные методы.
      При создании объекта ""Motorcycle"", число колес устанавливается в 2, а скорость в 0.
      В методе ""testDrive()"" скорость устанавливается на 75, а в методе ""park()"" - обратно в 0.

    */

    private String company;
    private String model;
    private int yearRelease;
    private int numWheels;
    private int speed;

    public abstract void testDrive();

    public abstract void park();

}
