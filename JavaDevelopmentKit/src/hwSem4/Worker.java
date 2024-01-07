package hwSem4;

public class Worker<T extends Number> {


    // region Поля
    T idWorker;
    String telephone;
    String name;
    String experience;

    // endregion

    // region Конструкторы
    public Worker(T idWorker, String telephone, String name, String experience) {
        this.idWorker = idWorker;
        this.telephone = telephone;
        this.name = name;
        this.experience = experience;
    }

    public Worker(T idWorker, String telephone, String name) {
        this.idWorker = idWorker;
        this.telephone = telephone;
        this.name = name;
    }
    // endregion

    // region Методы
    public T getIdWorker() {
        return idWorker;
    }

    public String getTelephone() {
        return telephone;
    }
    public String getName() {
        return name;
    }

    public String getExperience() {
        return experience;
    }

    public Worker create(T idWorker, String telephone, String name, String experience){
        return new Worker(idWorker, telephone, name, experience);
    }

    @Override
    public String toString() {
        return "Сотрудник: табельный номер: " + getIdWorker() +
                ", телефон: " + getTelephone() +
                ", имя: " + getName() +
                ", стаж работы: " + getExperience() + ".";
    }

    // endregion
}
