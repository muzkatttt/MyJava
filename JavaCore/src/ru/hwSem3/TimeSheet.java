package ru.hwSem3;

import java.util.ArrayList;
import java.util.List;

public class TimeSheet implements ListWorker {

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
    // endregion
}
