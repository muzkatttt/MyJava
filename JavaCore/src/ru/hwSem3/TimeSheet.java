package ru.hwSem3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TimeSheet implements ListWorker, Comparator<AbstractWorker> {
    @Override
    public int compare(AbstractWorker o1, AbstractWorker o2) {
        if (o1.salary == o2.salary) {
            return 0;
        }
        else if(o1.salary > o2.salary){
            return 1;
        }
        else return -1;
    }


    /* Создание на базе абстрактного класса коллекции (списка) сотрудников и его заполнение */
    List<AbstractWorker> timeSheet = new ArrayList<>();

    // region Методы

    /**
     *
     * @param abstractWorker базовый класс
     * содержит методы добавления нового сотрудника в список
     * и вывод всех сотрудников в консоль
     */
    @Override
    public void addWorkerToList(AbstractWorker abstractWorker) {
        timeSheet.add(abstractWorker);
    }

    @Override
    public void showAllWorkers() {
        for (AbstractWorker worker : timeSheet ) {
            System.out.println(worker);
        }
    }

    public TimeSheet(List<AbstractWorker> timeSheet) {
        this.timeSheet = timeSheet;
    }

    public TimeSheet() {
    }
    // endregion
}
