package lesson5;

import java.util.Objects;

public class ObjectToLock {
    public synchronized void stepOne(ObjectToLock object){
        System.out.println("stepOne: " + Thread.currentThread().getName());
        object.stepTwo(this);

    }
    public synchronized void stepTwo(ObjectToLock object){
        System.out.println("stepTwo: " + Thread.currentThread().getName());
        object.toString();
    }
}
