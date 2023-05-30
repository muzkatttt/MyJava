public class Cat {

    public Cat(String name, int age){
        this.name = name;
        this.age = age;
    }
    String name;
    int age;

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
