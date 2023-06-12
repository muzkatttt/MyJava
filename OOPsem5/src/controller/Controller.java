package controller;

import model.Student;
import model.Teacher;
import service.DataServiceImpl;

import java.util.List;

public class Controller {
    DataServiceImpl dataService;

    public Controller() {
        this.dataService = new DataServiceImpl();
    }

    public void create(List<Student> inputList, Teacher teacher) {
        if (inputList != null && teacher != null) {
            dataService.create(inputList, teacher);
        }
        else {
            System.out.println("Wrong data!");
        }
    }

    public void create(Student inputStudent) {
        dataService.create(inputStudent);
    }


    public void read() {
        dataService.read();
    }

}
