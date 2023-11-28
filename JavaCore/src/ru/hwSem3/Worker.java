package ru.hwSem3;

import ru.sem3.Cat;

public class Worker extends AbstractWorker {

    // region Конструкторы
    public Worker(String name, int salary, String postWorker) {
        super(name, salary, postWorker);
    }

    // endregion

    // region Методы

    public static Worker create(String name, int salary, String postWorker){
        return new Worker(name, salary, postWorker);
    }
    @Override
    public void calculateSalary() {
        //для работников с фиксированной оплатой «среднемесячная заработная плата
        // = фиксированная месячная оплата».
        if (salary >= 10_000) {
            salary = salary * 1;
        }
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public void setSalary(int salary) {
        super.setSalary(salary);
    }

    @Override
    public void setPostWorker(String postWorker) {
        super.setPostWorker(postWorker);
    }

    @Override
    public String toString() {
        return "Worker " +
                "name: '" + name + '\'' +
                ", salary: " + salary +
                ", postWorker: '" + postWorker + '\'' +
                '.';
    }

    // endregion

    // region Поля
    @Override
    public int getSalary() {
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

    // endregion Поляуцй

}
