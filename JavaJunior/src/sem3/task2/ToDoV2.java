package sem3.task2;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class ToDoV2 implements Externalizable {

    //region Поля

    /**
     * Наименование задачи
     */
    private String title;

    /**
     * Статус задачи
     */
    private boolean isDone;

    //endregion

    //region Конструкторы

    public ToDoV2() {
    }

    public ToDoV2(String title) {
        this.title = title;
        isDone = false;
    }

    //endregion

    //region Методы

    /**
     * Получить наименование задачи
     *
     * @return наименование задачи
     */
    public String getTitle() {
        return title;
    }

    /**
     * Получить статус выполнения задачи
     *
     * @return статус выполнения задачи
     */
    public boolean isDone() {
        return isDone;
    }

    /**
     * Изменить статус выполнения задачи
     *
     * @param done новый статус задачи
     */
    public void setDone(boolean done) {
        isDone = done;
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeObject(title);
        out.writeBoolean(isDone);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        title = (String) in.readObject();
        isDone = in.readBoolean();
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ToDoV2{");
        sb.append("title='").append(title).append('\'');
        sb.append(", isDone=").append(isDone);
        sb.append('}');
        return sb.toString();
    }


//endregion

}
