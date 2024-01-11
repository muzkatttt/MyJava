package sem5.task1;

public class Main {
    /*
  В рамках выполнения задачи необходимо:
  Создать два класс ObjectA, ObjectB
  Реализовать класс в котором два потока при запуске провоцируют DeadLock для объектов ObjectA, ObjectB
   */
    public static void main(String[] args) {
        Friend friend1 = new Friend("Вася");
        Friend friend2 = new Friend("Петя");

        MyThread thread1 = new MyThread(friend1, friend2);
        MyThread thread2 = new MyThread(friend2, friend1);

        thread1.start();
        thread2.start();

        System.out.println("конец работы");
    }
}
