package ru.hwSem3;


public abstract class AbstractWorker implements Comparable<AbstractWorker>{
    @Override
    public int compareTo(AbstractWorker o) {
        return Integer.compare(this.salary, o.salary);
    }
    // region Поля

    protected String name;
    protected int salary;
    public String postWorker;

    public int getSalary() {
        return salary;
    }

    public String getPostWorker() {
        return postWorker;
    }

    public String getName() {
        return name;
    }

    // endregion

    // region Конструкторы
    public AbstractWorker(String name, int salary, String postWorker) {
        this.name = name;
        this.salary = salary;
        this.postWorker = postWorker;
    }

    // endregion

    // region Методы

    public abstract void calculateSalary();
    /* абстрактный метод для расчёта среднемесячной заработной платы */


    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setPostWorker(String postWorker) {
        this.postWorker = postWorker;
    }

    @Override
    public String toString() {
        return "AbstractWorker{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", postWorker='" + postWorker + '\'' +
                '}';
    }
    // endregion
}
