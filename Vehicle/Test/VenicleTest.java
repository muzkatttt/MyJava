import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class VenicleTest {
    /*
    c). Написать следующие тесты:
    1) проверка того, что экземпляр объекта Car также является экземпляром транспортного средства;
       (instanceof)
    2) проверка того, объект Car создается с 4-мя колесами
    3) проверка того, объект Motorcycle создается с 2-мя колесами
    4) проверка того, объект Car развивает скорость 60 в режиме тестового вождения
       (используя метод testDrive())
    5) проверка того, объект Motorcycle развивает скорость 75 в режиме тестового вождения (testDrive())
    6) проверить, что в режиме парковки (сначала testDrive, потом park,
       т.е эмуляция движения транспорта) машина останавливается (speed = 0)
    7) проверить, что в режиме парковки (сначала testDrive, потом park
       т.е эмуляция движения транспорта) мотоцикл останавливается (speed = 0)
     */

    Car car;
    Motorcycle motorcycle;
    private String company;
    private String model;
    private int yearRelease;
    private int numWheels;
    private int speed;


    @Test
    void testDrive() {
        this.speed = 60;
    }

    @Test
    void park() {
        this.speed = 0;
    }

    // 1)  проверка того, что экземпляр объекта Car также является экземпляром транспортного средства;
    //    через (instanceof)
    @Test
    void instanceOf() {
        Car car = new Car("Skoda", "Superb", 2023);
        assertThat(car instanceof Car);
        //assertThat((car) instanceof Car ? (Car) assertThat(car)) : null;
    }

    // 2) проверка того, объект Car создается с 4-мя колесами
    @Test
    void wheelsCar() {
        Car car = new Car("Skoda", "Fabia", 2012);
        assertThat(car.getNumWheels()).isEqualTo(4);
    }

     // 3) проверка того, объект Motorcycle создается с 2-мя колесами
    @Test
    void motorcycleWheels () {
        Motorcycle motorcycle = new Motorcycle("Izh", "Planeta", 1998);
        assertThat(motorcycle.getNumWheels()).isEqualTo(2);
    }

    // 4) проверка того, объект Car развивает скорость 60 в режиме тестового вождения (testDrive())
    @Test
    void testDriveCar() {
        Car car = new Car("Skoda", "Fabia", 2012);
        car.testDrive();
        assertThat(car.getSpeed()).isEqualTo(60);
    }

    // 5) проверка того, объект Motorcycle развивает скорость 75 в режиме тестового вождения (testDrive())
    @Test
    void testDriveMotorcycle() {
        Motorcycle motorcycle = new Motorcycle("Izh", "Planeta", 1998);
        motorcycle.testDrive();
        assertThat(motorcycle.getSpeed()).isEqualTo(75);
    }

    // 6) проверить, что в режиме парковки (сначала testDrive, потом park. т.е эмуляция движения транспорта)
    //    машина останавливается (speed = 0)
    @Test
    void carPark() {
        Car car = new Car("Skoda", "Fabia", 2012);
        car.testDrive();
        System.out.println(car.getSpeed());
        car.park();
        assertThat(car.getSpeed()).isEqualTo(0);
    }

    // 7) проверить, что в режиме парковки (сначала testDrive, потом park
    //    т.е эмуляция движения транспорта) мотоцикл останавливается (speed = 0)

    @Test
    void motorcyclePark() {
        Motorcycle motorcycle = new Motorcycle("Izh", "Planeta", 1998);
        motorcycle.testDrive();
        motorcycle.park();
        assertThat(motorcycle.getSpeed()).isEqualTo(0);
    }
}