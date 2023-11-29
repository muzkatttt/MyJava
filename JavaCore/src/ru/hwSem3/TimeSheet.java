package ru.hwSem3;

import java.util.ArrayList;
import java.util.List;

public class TimeSheet implements ListWorker {

    /* Создание на базе абстрактного класса коллекции (списка) сотрудников и его заполнение */

    // region Поля
    List<AbstractWorker> timeSheet = new ArrayList<>();

    // endregion

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
