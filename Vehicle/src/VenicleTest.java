import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.assertj.core.api.ClassBasedNavigableIterableAssert.assertThat;

public class VenicleTest {
    /*
    Настроить тестовую среду (создать тестовый класс VehicleTest,
    пометить папку как Test sources (зеленая папка), импортировать
    необходимые для тестов библиотеки (JUnit, assertJ)
    c). Написать следующие тесты:
             - проверка того, что экземпляр объекта Car
               также является экземпляром транспортного средства; (instanceof)
             - проверка того, объект Car создается с 4-мя колесами
             - проверка того, объект Motorcycle создается с 2-мя колесами
             - проверка того, объект Car развивает скорость 60 в режиме
               тестового вождения (используя метод testDrive())
             - проверка того, объект Motorcycle развивает скорость 75
               в режиме тестового вождения (testDrive())
             - проверить, что в режиме парковки (сначала testDrive, потом park,
               т.е эмуляция движения транспорта) машина останавливается (speed = 0)
             - проверить, что в режиме парковки (сначала testDrive, потом park
               т.е эмуляция движения транспорта) мотоцикл останавливается (speed = 0)
     */
    public static void main(String[] args) {
        //Car car = new Car("Skoda", "Superb", 2023);
        //Motorcycle motorcycle = new Motorcycle("Izh", "Planeta", 2007);

        @Test
        // проверка того, что экземпляр объекта Car также является
        // экземпляром транспортного средства; (instanceof)
        void instainceOf(){
            Assertions.assertThat(Car.class) instanceof(Car) assertThat(car) : null;
            Assertions.assertThat(Car.class.instanceof
            (Car.class.getSimpleName()) instanceof  ? (() (Car.class.getSimpleName())) : null;;
        }
//        assertThatThrownBy(() ->
//                CalculatorHW1.calculateDiscount(10, -5)).isInstanceOf(ArithmeticException.class);
//        void instanceOf() {
//            Car car = new Car("Skoda", "Superb", 2023);
//            assertThat(car) instanceof Car ? ((Car) assertThat(car)) : null;
//            //assertThat(car instanceof Vehicle);
//        }
//
//        //- проверка того, объект Car создается с 4-мя колесами
//        @Test
//        void WheelsCar() {
//            //Car car = new Car("KIA", "Optima", 2022);
//            assertThat(car.getNumWheels()).isEqualTo(4);
//        }
//
//        // - проверка того, объект Motorcycle создается с 2-мя колесами
//        @Test
//        void MotorcycleWheels () {
//            //Motorcycle moto = new Motorcycle("Honda", "Gold Wing", 2020);
//            assertThat(moto.getNumWheels()).isEqualTo(2);
//        }
//
//        //- проверка того, объект Car развивает скорость 60 в режиме тестового вождения (testDrive())
//        @Test
//        void testDriveCar () {
//            car.testDrive();
//            assertThat(car.getSpeed()).isEqualTo(60);
//        }
//
//        // - проверка того, объект Motorcycle развивает скорость 75 в режиме тестового вождения (testDrive())
//        @Test
//        void testDriveMotorcycle () {
//            moto.testDrive();
//            assertThat(moto.getSpeed()).isEqualTo(75);
//        }
//
//        //- проверить, что в режиме парковки (сначала testDrive, потом park,
//        // т.е эмуляция движения транспорта) машина останавливается (speed = 0)
//        @Test
//        void parkCar () {
//            car.testDrive();
//            //System.out.println(car.getSpeed());
//            CAR.PARK();
//            assertThat(car.getSpeed()).isEqualTo(0);
//        }
//
//        //- проверить, что в режиме парковки (сначала testDrive, потом park
//        // т.е эмуляция движения транспорта) мотоцикл останавливается (speed = 0)
//        @Test
//        void parkMotorcycle () {
//            moto.testDrive();
//            //System.out.println(moto.getSpeed());
//            moto.park();
//            assertThat(moto.getSpeed()).isEqualTo(0);
//        }

//        try {
//            CalculatorHW1.calculateDiscount(-1.0, -1);
//        } catch (ArithmeticException e) {
//            assertThatThrownBy(() ->
//                    CalculatorHW1.calculateDiscount(0, -1)).isInstanceOf(ArithmeticException.class);
//        }
    }
}
