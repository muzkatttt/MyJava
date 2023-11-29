package ru.hwSem3;

public class Freelancer extends AbstractWorker implements Comparable<Freelancer> {

    /**
     * Класс Freelancer
     * @rate тариф для расчета заработной платы
     * @salary заработная плата
     */

    // region Поля
    protected int rate;

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

    // region Конструктор
    public Freelancer(String name, int salary, String postWorker) {
        super(name, salary, postWorker);
    }

    // endregion Конструктор

    // region Методы

    public static Freelancer create(String name, int salary, String postWorker){
        return new Freelancer(name, salary, postWorker);
    }

    @Override
    public void calculateSalary() {
        // Для «повременщиков» формула для расчета:
        // «среднемесячная заработная плата = 20.8 * 8 * почасовая ставка»
        salary = (int) (rate * 20.8 * 8);
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
        return "Freelancer " +
                "name: " + name + '\'' +
                ", salary: " + salary +
                ", postWorker: '" + postWorker + '\'' +
                '.';
    }

    /**
     *
     * @param o the object to be compared.
     * Сортировка группы фрилансеров по уровню заработной платы от большей к меньшей
     * @return
     */
    @Override
    public int compareTo(Freelancer o) {
        if(this.getSalary() > o.getSalary()) return -1;
        else if (this.getSalary() < o.getSalary()) return 1;
        else return 0;
    }

    // endregion
}
