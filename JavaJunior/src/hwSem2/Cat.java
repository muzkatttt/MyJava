package hwSem2;

public class Cat extends Animal{

    // region Поля
    String owner;

    // endregion

    // region Конструкторы
    public Cat(String name, String age, String owner) {
        super(name, age);
        this.owner = owner;
    }

    // endregion

    // region Методы
    public static Cat create(String name, String age, String owner){
        return new Cat(name, age, owner);
    }

    public void playWithToy(){
        System.out.printf("Cat %s playing with toy\n", getName());
    }

    @Override
    public void makeSound() {
        System.out.printf("The cat %s says meow\n", getName());
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Cat{");
        sb.append("name='").append(name).append('\'');
        sb.append(", age='").append(age).append('\'');
        sb.append(", owner='").append(owner).append('\'');
        sb.append('}');
        return sb.toString();
    }

    // endregion
}
