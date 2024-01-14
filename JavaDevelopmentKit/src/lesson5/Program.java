package lesson5;

public class Program {
    public static void main(String[] args) {
        // deadLock
        ObjectToLock objectToLockOne = new ObjectToLock();
        ObjectToLock objectToLockTwo = new ObjectToLock();
        getThread(objectToLockTwo, objectToLockOne);
        getThread(objectToLockOne, objectToLockTwo);
    }

    private static void getThread(ObjectToLock objectToLockOne, ObjectToLock objectToLockTwo) {
            new Thread(new Runnable() {
            @Override
                    public void run() {
                System.out.println("run: " + Thread.currentThread().getName());
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                objectToLockTwo.stepOne(objectToLockOne);
            }
    }).start();
    }
}
