package hwSem2;


import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Animal> animals = new ArrayList<>();
        Cat cat = Cat.create("Karamel`ka", "4 year", "Bengal");
        Dog dog = Dog.create("Buba", "1 year", "Noble");

        animals.add(cat);
        animals.add(dog);

        System.out.println(animals);
    }
}
