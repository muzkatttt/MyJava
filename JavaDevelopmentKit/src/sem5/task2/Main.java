package sem5.task2;

public class Main {
    /*
    В рамках выполнения задачи необходимо:
    Создайте два потока A и B.
    Поток A меняет значение Boolean переменной switcher с задержкой 1000 миллисекунд
    (true в состояние false и наоборот).
    Поток B ожидает состояния true переменной switcher и выводит на консоль обратный отсчет от 100
    с задержкой 100 миллисекунд и приостанавливает свое действие, как только поток A переключит switcher
    в состояние false.
    Условием завершения работы потоков является достижение отсчета нулевой отметки.
    Можно воспользоваться синхронизацией для управления значения переменной или volatile
     */
    public static void main(String[] args) {
        MyProgramState state = new MyProgramState();

        MyThread1 thread1 = new MyThread1(state);
        MyThread2 thread2 = new MyThread2(state);

        thread1.start();
        thread2.start();
    }
}
