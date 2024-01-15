package lesson5;

public class ObjectToLock {
    // ReentrantLock - возобновляемая блокировка как альтернатива synchronized
    public synchronized void stepOne(ObjectToLock object){
        System.out.println("stepOne: " + Thread.currentThread().getName());
        object.stepTwo(this);

    }
    public synchronized void stepTwo(ObjectToLock object){
        System.out.println("stepTwo: " + Thread.currentThread().getName());
        object.toString();
    }
}
