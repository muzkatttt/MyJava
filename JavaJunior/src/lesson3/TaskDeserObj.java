package lesson3;

import java.io.IOException;
import java.util.ArrayList;

import static lesson3.TaskSerDeserObject.deSerialObject;

public class TaskDeserObj {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ArrayList<String> list = null;
        list = (ArrayList<String>) deSerialObject("ser");
        System.out.println(list);
    }
}
