package ru.hwSem3;

import java.util.Comparator;

public class WorkerComparator implements Comparator<AbstractWorker> {

    @Override
    public int compare(AbstractWorker o1, AbstractWorker o2) {
        return Integer.compare(o1.getSalary(), o2.getSalary());
    }
}

