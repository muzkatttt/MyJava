package lesson3;

import java.io.IOException;
import java.io.Serializable;

import static lesson3.TaskSerDeserObject.deSerialObject;
import static lesson3.TaskSerDeserObject.serialObject;

public class Task5MyFCs implements Serializable {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        Task5MyFCs myFCs = new Task5MyFCs("Karamel`kina", "Karamel`ka", "Simbovna");
//
//        serialObject(myFCs, "ser");

        Task5MyFCs myFCs = (Task5MyFCs) deSerialObject("ser");
        System.out.println(myFCs);
    }
    public String lName; // десериализация объекта из файла в конткретный объект используются поля объекта
    // поэтому используется публичный доступ к полям
    public String fName;

    public String patronymic;

    public Task5MyFCs(String lName, String fName, String patronymic) {
        this.lName = lName;
        this.fName = fName;
        this.patronymic = patronymic;
    }

    @Override
    public String toString() {
        return String.format("%s %s.%s.",
                fName,
                lName.toUpperCase().charAt(0),
                patronymic.toUpperCase().charAt(0));
    }

}
