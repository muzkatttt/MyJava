package lesson2;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Car car = new Car("BMW");
        System.out.println(car);

        Class<?> car1 = Class.forName("Car");
        Constructor<?>[] constructors = new Constructor[]{car1.getConstructor()};

        Object gaz = constructors[0].newInstance("Skoda");
        System.out.println(gaz);

        Field[] fields = gaz.getClass().getFields();
        int tmp = fields[fields.length-1].getInt(gaz);
        fields[fields.length - 1].setInt(gaz, tmp);
        System.out.println(gaz);

        Method[] methods = gaz.getClass().getMethods(); //getDeclaredMethods() покажет методы класса Сar
        for (int i =0; i < methods.length; i++){
            System.out.println(methods[i]);
        }
    }
}
