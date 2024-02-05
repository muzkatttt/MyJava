package hwSem2;

public class Dog extends Animal{
    String name;
    String age;
    String breed;

    public Dog(String name, String age, String breed) {
        this.name = name;
        this.age = age;
        this.breed = breed;
    }

    public static Dog create(String name, String age, String breed){
        return new Dog(name, age, breed);
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Dog{");
        sb.append("name='").append(name).append('\'');
        sb.append(", age='").append(age).append('\'');
        sb.append(", breed='").append(breed).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
