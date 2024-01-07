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
     *
     * @param name
     * @return
     */
    //Добавить метод, который возвращает номер телефона сотрудника по имени (может быть список)
    public ArrayList<Worker> searchTelephone(String name) {
        ArrayList<Worker> searchResult = new ArrayList<>();
        for (Worker worker : this.employeeHandbook) {
            if (worker.getName().equals(name)) {
                searchResult.add(worker);
            }
        }
        return searchResult;
    }
//    Добавить метод, который ищет сотрудника по табельному номеру

    public Worker searchByIdWorker(int searchIdWorker) {
        for (Worker worker : this.employeeHandbook) {
            if (worker.getIdWorker().equals(searchIdWorker)){
                return worker;
            }
        }
        return null;
    }
//    Добавить метод добавление нового сотрудника в справочник
    public void addNewWorker(Worker worker) {
        this.employeeHandbook.add(worker);
    }

    @Override
    public String toString() {
        return "Cправочник сотрудников: " + "\n" + employeeHandbook;
    }
}
