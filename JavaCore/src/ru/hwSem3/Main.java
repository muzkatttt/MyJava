package ru.hwSem3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

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
        Freelancer freelancer5 = Freelancer.create("Mary", 45_000, "engineer");
        Worker worker6 = Worker.create("Ben", 100_000, "analyst");

        List<AbstractWorker> list = new ArrayList<>();
        list.add(freelancer0);
        list.add(worker1);
        list.add(freelancer2);
        list.add(worker3);
        list.add(worker4);
        list.add(freelancer5);
        list.add(worker6);

        Iterator<AbstractWorker> workerIterator = list.iterator();
        while (workerIterator.hasNext()) {
            System.out.println(workerIterator.next().toString());
        }

        System.out.println("\n");

        /**
         * Создание коллекции фрилансеров (TreeSet) и сравнение их заработных плат от большей к меньшей
         */

        TreeSet<Freelancer> listFreelancers = new TreeSet<>();
        listFreelancers.add(freelancer0);
        listFreelancers.add(freelancer2);
        listFreelancers.add(freelancer5);

        for (Freelancer f: listFreelancers) {
            System.out.println(f);
        }

        System.out.println("\n");

        /**
         * Создание коллекции работников с фиксированной оплатой труда,
         * и сравнение их заработной платы от меньшей к большей.
         */

        TreeSet<Worker> listWorkers = new TreeSet<>();
        listWorkers.add(worker1);
        listWorkers.add(worker3);
        listWorkers.add(worker6);

        for (Worker worker: listWorkers) {
            System.out.println(worker);
        }

        System.out.println("\n");


        /** Вариант 2.
         * Создание табеля учета сотрудников с помощью методов класса TimeSheet,
         * их добавление в табель учета и вывод в консоль.
        */

        TimeSheet timeSheet = new TimeSheet();
        timeSheet.addWorkerToList(freelancer0);
        timeSheet.addWorkerToList(worker1);
        timeSheet.addWorkerToList(freelancer2);
        timeSheet.addWorkerToList(worker3);
        timeSheet.addWorkerToList(worker4);

        timeSheet.showAllWorkers();

    }
}
