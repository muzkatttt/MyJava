package sem2.task1;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Program {

    /**
     * Задача 1: Основы Reflection API
     * ===============================
     * <p>
     * Получите информацию о классе "Person" с использованием Reflection API:
     * выведите на экран все поля и методы класса.
     * Создайте экземпляр класса "Person" с использованием Reflection API,
     * установите значения полей и вызовите методы.
     * Реализуйте обработку исключений для обеспечения корректного взаимодействия
     * с Reflection API.
     */
    public static void main(String[] args) throws ClassNotFoundException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchFieldException, NoSuchMethodException {


        Class<?> personalClass = Class.forName("ru.geekbrains.junior.lesson2.task1.Person");


        // Получить список всех полей
        Field[] fields = personalClass.getDeclaredFields();
        for (Field field : fields){
            System.out.println("Поле: " + field.getName());
        }

        Constructor[] constructors = personalClass.getConstructors();

        Object personInstance = constructors[0].newInstance(null);

        Field nameField = personalClass.getDeclaredField("name");
        nameField.setAccessible(true); // Разрешаем доступ к закрытому полю
        nameField.set(personInstance, "Alice");

        Field ageField = personalClass.getDeclaredField("age");
        ageField.setAccessible(true); // Разрешаем доступ к закрытому полю
        ageField.set(personInstance, 30);

        Method displayInfoMethod = personalClass.getDeclaredMethod("displayInfo");
        displayInfoMethod.invoke(personInstance);

    }

}
