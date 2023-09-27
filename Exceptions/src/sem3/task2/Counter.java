package sem3.task2;

public class Counter implements AutoCloseable{
    /*
    Задание No3
     Создайте класс Счетчик, у которого есть метод add(),
     увеличивающий значение внутренней int переменной на 1.
     Сделайте так, чтобы с объектом такого типа можно было работать в блоке try-with-resources.
     Подумайте, что должно происходить при закрытии этого ресурса? Напишите метод для проверки, закрыт ли ресурс.
     При попытке вызвать add() у закрытого ресурса, должен выброситься IOException*/

    private int count;
    private boolean isOpen;

    public Counter(int count) {
        this.count = 0;
        this.isOpen = true;
    }

    public void add() throws Exception {
        if(!this.isOpen) throw new Exception("counter is closed");
        this.count++;
    }

    @Override
    public void close() throws Exception {
        this.count = 0;
        this.isOpen = false;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public void setOpen(boolean open) {
        isOpen = open;
    }
}
