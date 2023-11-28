package ru.hwSem3;

import java.util.Iterator;
import java.util.function.Consumer;

public class TimeSheetIterator implements Iterable<TimeSheet>{
    @Override
    public Iterator<TimeSheet> iterator() {

        return null;
    }

    @Override
    public void forEach(Consumer<? super TimeSheet> action) {
        Iterable.super.forEach(action);
    }
}
