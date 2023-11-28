package ru.hwSem3;

public class Freelancer extends AbstractWorker {

    /**
     * Класс Freelancer
     * @rate тариф для расчета заработной платы
     * @salary заработная плата
     */

    // region Поля
    protected double rate;

    @Override
    public double getSalary() {
        return super.getSalary();
    }

    @Override
    public String getPostWorker() {
        return super.getPostWorker();
    }

    @Override
    public String getName() {
        return super.getName();
    }

    // endregion Поля

    // region Конструктор
    public Freelancer(String name, double salary, String postWorker) {
        super(name, salary, postWorker);
    }
    // endregion Конструктор

    // region Методы

    public static Freelancer create(String name, double salary, String postWorker){
        return new Freelancer(name, salary, postWorker);
    }
    @Override
    public void calculateSalary() {
        // Для «повременщиков» формула для расчета такова:
        // «среднемесячная заработная плата = 20.8 * 8 * почасовая ставка»
        salary = rate * 20.8 * 8;
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public void setSalary(double salary) {
        super.setSalary(salary);
    }

    @Override
    public void setPostWorker(String postWorker) {
        super.setPostWorker(postWorker);
    }

    @Override
    public String toString() {
        return "Freelancer " +
                "name: " + name + '\'' +
                ", salary: " + salary +
                ", postWorker: '" + postWorker + '\'' +
                '.';
    }

    // endregion
}
