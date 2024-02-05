package hwSem2;

public class Cat extends Animal{

    String name;
    String age;
    String breed;

    public Cat(String name, String age, String breed) {
        this.name = name;
        this.age = age;
        this.breed = breed;
    }

    public static Cat create(String name, String age, String breed){
        return new Cat(name, age, breed);
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Cat{");
        sb.append("name='").append(name).append('\'');
        sb.append(", age='").append(age).append('\'');
        sb.append(", breed='").append(breed).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
