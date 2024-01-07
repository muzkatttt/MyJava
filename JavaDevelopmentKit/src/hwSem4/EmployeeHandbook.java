package hwSem4;

import java.util.ArrayList;

public class EmployeeHandbook {

    // region Поля

    ArrayList<Worker> employeeHandbook;

    // endregion


    // region Конструкторы
    public EmployeeHandbook(ArrayList<Worker> employeeHandbook) {
        this.employeeHandbook = new ArrayList<>();
    }

    public EmployeeHandbook() {
        this.employeeHandbook = new ArrayList<>();
    }
    // endregion

    // region Методы
    /**
     * Метод, который ищет сотрудника по стажу работы
     * @param workExperience стаж работы сотрудника
     * @return result, если сотрудник найден
     */
    public Worker searchByExperience(String workExperience) {
        System.out.println("Поиск по стажу работы в компании: ");
        for (Worker worker : this.employeeHandbook) {
            if (worker.getExperience().equals(workExperience)) {
                System.out.println("По запросу " + "\'workExperience\'" + " найден: ");
                return worker;
            }
        }
        return null;
    }

    /**
     * Метод, который возвращает номер телефона сотрудника по имени
     * @param name имя сотрудника
     * @return searchResult, если по заданным параметрам найдено совпадение
     */
    public String searchTelephone(String name) {
        for (Worker worker : this.employeeHandbook) {
            if (worker.getName().equals(name)) {
                System.out.println("По введенному имени найден номер телефона сотрудника " + name + ":");
                return worker.getTelephone();
            }
        }
        return null;
    }

    /**
     * Метод, который ищет сотрудника по табельному номеру
     * @param searchIdWorker табельный номер для поиска
     * @return worker, если найдено совпадение в списке сотрудников
     */
    public Worker searchByIdWorker(Number searchIdWorker) {
        System.out.println("Поиск сотрудника по табельному номеру:");
        for (Worker worker : this.employeeHandbook) {
            if (worker.getIdWorker().equals(searchIdWorker)){
                System.out.println("По запросу " + searchIdWorker + " найден:");
                return worker;
            }
        }
        return null;
    }

    /**
     * Метод добавления нового сотрудника в справочник
     * @param worker экземпляр класса, который добавляется в справочник
     */
    public void addNewWorker(Worker worker) {
        this.employeeHandbook.add(worker);
    }

    /**
     * Вывод справочника сотрудников на экран
     * @return список сотрудников
     */
    @Override
    public String toString() {
        System.out.println("Cправочник сотрудников: " + "\n");
        for (Worker worker: employeeHandbook) {
            System.out.println("- " + worker);
        }
        return "";
    }
    // endregion
}
