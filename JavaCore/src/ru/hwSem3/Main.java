package ru.hwSem3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        /*
        Создание новых экземпляров, их добавление в список типа <AbstractWorker> и вывод в консоль с помощью итератора
         */

        Freelancer freelancer0 = Freelancer.create("Nika", 35_000, "engineer");
        Worker worker1 = Worker.create("Alex", 50_000, "tester");
        Freelancer freelancer2 = Freelancer.create("Den", 50_000, "analyst");
        Worker worker3 = Worker.create("Mike", 60_000, "developer");
        AbstractWorker worker4 = Worker.create("Kate", 30_000, "designer");

        List<AbstractWorker> list = new ArrayList<>();
        list.add(freelancer0);
        list.add(worker1);
        list.add(freelancer2);
        list.add(worker3);
        list.add(worker4);

        Iterator<AbstractWorker> workerIterator = list.iterator();
        while (workerIterator.hasNext()) {
            System.out.println(workerIterator.next().toString());
        }

        System.out.println("\n");


        for (AbstractWorker w: worker) {
            System.out.println(w);
        }
        /*
        Вариант 2. Создание табеля учета сотрудников, с помощью методов класса TimeSheet их добавление в табель учета
        и вывод в консоль
         */
        TimeSheet timeSheet = new TimeSheet();
        timeSheet.addWorkerToList(freelancer0);
        timeSheet.addWorkerToList(worker1);

        timeSheet.addWorkerToList(freelancer2);
        timeSheet.addWorkerToList(worker3);
        timeSheet.addWorkerToList(worker4);
        timeSheet.showAllWorkers();

        for (AbstractWorker w: worker) {
            System.out.println(w);
        }


    }
}
