package lesson5;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicInteger;

public class Task implements Runnable{
    //private final int left; // в первой половине лдекции
    //private  int value;
    // если заменить на атомарный тип данных, то изменение вызывается в методе
    // inc() методом incrementAndGet();
    private final AtomicInteger value;
    private CountDownLatch cdl;

    public Task(int left) {
        //this.value = left; для value int
        this.value = new AtomicInteger(left);
    }

    public void setCdl(CountDownLatch cdl) {
        this.cdl = cdl;
    }

    // первый способ
//    public synchronized void inc(){ // когда указывается synchronized - потоки синхронизируются
//        value++;
//    }

    // второй способ - его лучше использовать
//    public void inc(){
//        synchronized (Task.class);
//        value++;
//    }

    // третий способ используется при типе данных value AtomicInteger
    public void inc(){
        value.incrementAndGet();
    }


//    public Task(int left, int right) {
//        this.left = left;
//        this.right = right;
//    }

    public int getValue() {
        //return value; // при int value
        return value.intValue();
    }

    @Override
    public void run() {
        for (int i = 0; i < 100000; i++) {
            inc();
        }
        cdl.countDown(); //
        //System.out.println(value); //left + right
    }

    @Override
    public String toString() {
        return String.format("(%s)", value);
    }
}
