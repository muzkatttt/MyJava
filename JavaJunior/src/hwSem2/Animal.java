package hwSem2;


public abstract class Animal {

    // region Поля
    String name;
    String age;

    // endregion

    // region Конструкторы
    public Animal(String name, String age) {
        this.name = name;
        this.age = age;
    }

    // endregion

    // region Методы
    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    /**
     * Как говорит питомец
     */
    public void makeSound(){
        System.out.printf("%s do something...", Animal.class.getName());
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Animal{");
        sb.append("name='").append(name).append('\'');
        sb.append(", age='").append(age).append('\'');
        sb.append('}');
        return sb.toString();
    }

    // endregion

}
