package sem4.models;

public class Person {

    private String name;
    private int age;

    private Person(String name, int age){
        this.age = age;
        this.name = name;
    }

    public static Person create(String name, int age)
    {
        //TODO: Проверка параметров

        return new Person(name, age);
    }



}
