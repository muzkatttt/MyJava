package ru.gb.hwsem2;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping({"students", "group"})
public class StudentController {

    //3.2 GET /student - получить всех студентов
    //localhost:8080/students
    //@ResponseBody - не ставится, если у класса есть аннотация @RestController
    @GetMapping() //value = "all", produces = MediaType.TEXT_HTML_VALUE
    public ArrayList<Student> getAll(){
        return studentGroupRepository.getAll();
    }

    private StudentRepository studentGroupRepository;

    @Autowired
    public StudentController(StudentRepository studentGroupRepository) {
        this.studentGroupRepository = studentGroupRepository;
    }

    //3.1. GET /students/{id} - получить студента по ID
    // localhost:8080/students/7
    @GetMapping("{id}")
    public Student getById(@PathVariable long id){
        return studentGroupRepository.getById(id);
    }



    // GET /students/{studentName} - получить студента по имени
    // localhost:8080/students/studentName?studentName=Denis
    @GetMapping("studentName")
    public Student getByStudentName(@RequestParam String studentName){
        return studentGroupRepository.getByName(studentName);
    }

    // GET /student/search?name=studentName
    //получить список студентов, чье имя содержит подстроку studentName
    @GetMapping("/student/search")
    public Student getByStudentNameSearch(@RequestParam String studentName) {
        return studentGroupRepository.getByName(studentName);
    }


    // localhost:8080/group/groupName?groupName=Developers/students
    // GET /group/{groupName}/student - получить всех студентов группы
    @GetMapping("{groupName}")
    public Student getGroupName(@RequestParam String groupName) {
        if (groupName == null) {
            return new Student("Имя не задано", "Номер группы не задан");
        } else {
            return studentGroupRepository.getByGroup(groupName);
        }
    }

    // localhost:8080/group/groupName?groupName=Developer/student
    @GetMapping("/group/{groupName}/student")
    public List<Student> getGroupNameStudents(@PathVariable String groupName) {
        return List.of(studentGroupRepository.getByGroup(groupName));
    }
}
