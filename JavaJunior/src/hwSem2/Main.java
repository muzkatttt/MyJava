package hwSem2;


import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {

        // вариант 1
        ArrayList<Animal> listAnimals = new ArrayList<>();
        Cat cat = Cat.create("Karamel`ka", "4 year", "Katya");
        Dog dog = Dog.create("Buba", "1 year", "Noble");

        listAnimals.add(cat);
        cat.playWithToy();
        cat.makeSound();
        listAnimals.add(dog);
        dog.doCommands();
        dog.makeSound();

        System.out.println(listAnimals);

        // вариант 2
        Animal[] animals = {
                new Cat("Karamel`ka", "4 year", "Katya"),
                new Dog("Buba", "1 year", "Noble")
        };

        // вывод информации о каждом объекте через Reflection API
        for (Animal animal : animals) {
            System.out.printf("Pet: name %s, age %s.\n", animal.getName(), animal.getAge());
        }

        Method method = cat.getClass().getMethod("makeSound");
        method.invoke(cat);

        Method methodDog = dog.getClass().getMethod("makeSound");
        methodDog.invoke(dog);

    }
}
