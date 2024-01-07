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
    public ArrayList<Worker> searchByExperience(String workExperience) {
        ArrayList<Worker> result = new ArrayList<>();
        for (Worker worker : this.employeeHandbook) {
            if (worker.getExperience().equals(workExperience)) {
                result.add(worker);
            }
        }
        return result;
    }


    /**
     * Метод, который возвращает номер телефона сотрудника по имени
     * @param name имя сотрудника
     * @return searchResult, если по заданным параметрам найденоо совпадение
     */
    public ArrayList<Worker> searchTelephone(String name) {
        ArrayList<Worker> searchResult = new ArrayList<>();
        for (Worker worker : this.employeeHandbook) {
            if (worker.getName().equals(name)) {
                searchResult.add(worker);
            }
        }
        return searchResult;
    }

    /**
     * Метод, который ищет сотрудника по табельному номеру
     * @param searchIdWorker табельный номер для поиска
     * @return worker, если найдено совпадение в списке сотрудников
     */
    public Worker searchByIdWorker(int searchIdWorker) {
        for (Worker worker : this.employeeHandbook) {
            if (worker.getIdWorker().equals(searchIdWorker)){
                return worker;
            }
        }
        return null;
    }


    /**
     * Vетод добавлениz нового сотрудника в справочник
     * @param worker экземпляр класса, который добавляется в справочник
     */
    public void addNewWorker(Worker worker) {
        this.employeeHandbook.add(worker);
    }


    /**
     * Вывод справочника сотрудников на экран
     *
     * @return список сотрудников
     */
    @Override
    public String toString() {
        ArrayList<Worker> result = new ArrayList<>();
        System.out.println("Cправочник сотрудников: " + "\n");
        for (Worker worker: employeeHandbook) {
            System.out.println("- " + worker);
        }
        return null;
    }
    // endregion
}
