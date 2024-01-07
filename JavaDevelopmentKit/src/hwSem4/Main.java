package hwSem4;

public class Main {
    public static void main(String[] args) {

        EmployeeHandbook employeeHandbook = new EmployeeHandbook();

        Worker worker0 = new Worker(1, "+79992221100", "Kate", "22 year");
        Worker worker1 = new Worker(2.0, "+79921110099", "Alex", "6 months");
        Worker worker2 = new Worker(3, "+79872001010", "Den", "2 year 5 months");
        Worker worker3 = new Worker(4, "+79993330022", "Ivan", "11 months");
        Worker worker4 = new Worker(5, "+79871234567", "Marina", "1 year 1 month");

        // метод добавления нового сотрудника в справочник
        employeeHandbook.addNewWorker(worker0);
        employeeHandbook.addNewWorker(worker1);
        employeeHandbook.addNewWorker(worker2);
        employeeHandbook.addNewWorker(worker3);
        employeeHandbook.addNewWorker(worker4);

        System.out.println(employeeHandbook);

        // поиск по стажу работы
        String searchByExperience = String.valueOf(employeeHandbook.searchByExperience("6 months"));
        System.out.println(searchByExperience);
        System.out.println();

        // поиск по имени -> возвращает номер телефона
        String searchByTelephone = String.valueOf(employeeHandbook.searchTelephone("Den"));
        System.out.println(searchByTelephone);
        System.out.println();

        // поиск по табельному номеру
        String searchByIdWorker = String.valueOf(employeeHandbook.searchByIdWorker(1));
        System.out.println(searchByIdWorker);

    }

}
