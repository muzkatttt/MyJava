package ru.hwSem3;

import ru.sem3.Cat;

public abstract class AbstractWorker {

    // region Поля

    protected String name;
    protected double salary;
    public String postWorker;

    public double getSalary() {
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
    public AbstractWorker(String name, double salary, String postWorker) {
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

    public void setSalary(double salary) {
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
