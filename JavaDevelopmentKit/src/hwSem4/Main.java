package hwSem4;

public class Main {
    public static void main(String[] args) {

        EmployeeHandbook employeeHandbook = new EmployeeHandbook();

        Worker worker0 = new Worker(1, "+79992221100", "Kate", "22 year");
        Worker worker1 = new Worker(2.0, "+79921110099", "Alex", "6 months");
        Worker worker2 = new Worker(4f, "+79872001010", "Druzhok", "2 year 5 months");
        Worker worker3 = new Worker(3d, "+79993330022", "Ivan", "11 months");

        // метод добавления нового сотрудника в справочник
        employeeHandbook.addNewWorker(worker0);
        employeeHandbook.addNewWorker(worker1);
        employeeHandbook.addNewWorker(worker2);
        employeeHandbook.addNewWorker(worker3);
        System.out.println(employeeHandbook);

        // поиск по стажу работы
        String searchByExperience = String.valueOf(employeeHandbook.searchByExperience("22 year"));
        System.out.println(searchByExperience);

        // поиск по имени -> возвращает номер телефона
        String searchByTelephone = String.valueOf(employeeHandbook.searchTelephone("Alex"));
        System.out.println(searchByTelephone);

        // поиск по табельному номеру
        String searchByIdWorker = String.valueOf(employeeHandbook.searchByIdWorker(1));
        System.out.println(searchByIdWorker);

    }

}