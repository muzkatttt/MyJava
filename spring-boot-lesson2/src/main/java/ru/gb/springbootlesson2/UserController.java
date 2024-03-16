package ru.gb.springbootlesson2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("users")
public class UserController {

    //http://localhost:8180/users/all

//    @RequestMapping(path = "all", method = RequestMethod.GET)
//    @ResponseBody
//    @GetMapping(value = "all", produces = MediaType.TEXT_HTML_VALUE)
//    public String getAll(){
//        return "<h1>Привет</h1>";
//    }


    //  инъекция зависимости - внедрение одного бина в другой
//    @Autowired
    private UserRepository repository;

//    @Autowired
//    public void setRepository(UserRepository repository) {
//        this.repository = repository;
//    }

    @Autowired
    public UserController(UserRepository repository) {
        this.repository = repository;
    }

    @GetMapping("{id}")
    public User getById(@PathVariable long id){
        return repository.getById(id);
    }

    @GetMapping(value = "1")
    public List<User> getAll(){
        return repository.getAll();
    }

    @GetMapping()
    public User getByName(@RequestParam String name){
        return repository.getByName(name);
    }
}
