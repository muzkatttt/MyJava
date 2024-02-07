package hwSem2;

public class Dog extends Animal{

    // region Поля
    String breed;

    // endregion

    // region Конструкторы

    public Dog(String name, String age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    // endregion

    // region Методы
    public static Dog create(String name, String age, String breed){
        return new Dog(name, age, breed);
    }

    public void doCommands(){
        System.out.printf("The dog %s executes the command \"SHOW THE BUNNY\"\n", getName());
    }

    @Override
    public void makeSound() {
        System.out.printf("The dog %s says gaf\n", getName());
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

    // endregion
}
