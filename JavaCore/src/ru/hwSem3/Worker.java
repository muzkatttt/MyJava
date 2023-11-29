package ru.hwSem3;


public class Worker extends AbstractWorker implements Comparable<Worker>{

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

    /**
     *
     * @param o объект для сравнения.
     * Сортировка группы сотрудников по уровню заработной платы от меньшей к большей
     * @return
     */
    @Override
    public int compareTo(Worker o) {
        if (this.getSalary() > o.getSalary()) return 1;
        else if (this.getSalary() < o.getSalary()) return -1;
        else return 0;
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

    // endregion Поля

}
