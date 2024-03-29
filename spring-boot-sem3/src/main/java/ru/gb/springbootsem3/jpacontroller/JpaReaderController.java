package ru.gb.springbootsem3.jpacontroller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.gb.springbootsem3.jpaentity.ReaderJpa;
import ru.gb.springbootsem3.jpaservice.JpaReaderService;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class JpaReaderController {
    private final JpaReaderService jpaReaderService;
    @GetMapping("readers")
    public List<ReaderJpa> getUsers(){
        return jpaReaderService.getAllReaders();
    }

    @GetMapping("reader")
    public ReaderJpa getReaderById(long id){
        return jpaReaderService.getById(id);
    }

    @GetMapping("reader/{name}")
    public ReaderJpa getReaderByName(String name){
        return jpaReaderService.getByName(name);
    }

    @GetMapping("reader/{name}")
    public void deleteReaderByName(long id){
        jpaReaderService.deleteById(id);
    }

    @GetMapping("update")
    public ReaderJpa updateReader(@RequestParam long id, @RequestParam String newName){
        return jpaReaderService.updateReader(id, newName);
    }

}
