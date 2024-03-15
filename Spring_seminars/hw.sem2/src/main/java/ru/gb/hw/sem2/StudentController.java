package sem2;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("students")
public class StudentController {
    private StudentGroup studentGroupRepository;

    @Autowired
    public StudentController(StudentGroup studentGroupRepository) {
        this.studentGroupRepository = studentGroupRepository;
    }

    public Student getById

    //    @Autowired
//    public UserController(UserRepository repository) {
//        this.repository = repository;
//    }
//
//    @GetMapping("{id}")
//    public User getById(@PathVariable long id){
//        return repository.getById(id);
//    }
//
//    @GetMapping(value = "1")
//    public List<User> getAll(){
//        return repository.getAll();
//    }
//
//    @GetMapping()
//    public User getByName(@RequestParam String name){
//        return repository.getByName(name);
//    }
}
