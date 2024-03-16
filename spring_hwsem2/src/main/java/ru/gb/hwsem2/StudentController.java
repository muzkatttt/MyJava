package ru.gb.hwsem2;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("students")
public class StudentController {

    //3.2 GET /student - получить всех студентов
    //localhost:8080/students/all
    //@RequestMapping(path = "all", method = RequestMethod.GET)
    //@ResponseBody - не ставится, если у класса есть аннотация @RestController
    @GetMapping("all") //value = "all", produces = MediaType.TEXT_HTML_VALUE
    public ArrayList<Student> getAll(){
        return studentGroupRepository.getAll();
    }

    private StudentRepository studentGroupRepository;

    @Autowired
    public StudentController(StudentRepository studentGroupRepository) {
        this.studentGroupRepository = studentGroupRepository;
    }



    // localhost:8080/students/1
    @GetMapping("{id}")
    public Student getById(@PathVariable long id){
        return studentGroupRepository.getById(id);
    }


    // localhost:8080/students/studentName?studentName=Denis
    @GetMapping("studentName")
    public Student getByStudentName(@RequestParam String studentName){
        return studentGroupRepository.getByName(studentName);
    }

    // /student/search?name='studentName'
    @GetMapping("{groupName}")
    public Student getGroupName(@RequestParam String groupName){
        return studentGroupRepository.getByGroup(groupName);
    }


//    @GetMapping()
//    public User getByName(@RequestParam String name){
//        return repository.getByName(name);
//    }
}
