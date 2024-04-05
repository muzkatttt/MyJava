package ru.gb.springlesson7.service;

import lombok.RequiredArgsConstructor;
import org.hibernate.event.spi.RefreshEvent;
import org.springframework.context.ApplicationContext;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;
import ru.gb.springlesson7.model.Person;
import ru.gb.springlesson7.repository.PersonRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PersonService {

    private final PersonRepository repository;

    public Person createPerson(Person person){
        return repository.save(person);
    }

    public List<Person> getAll(){
        return repository.findAll();
    }

    public Person findById(long id){
        return repository.findById(id).orElseThrow(() ->
                new ResponseStatusException(HttpStatus.NOT_FOUND, "Нет пользователя с id " + id));
    }

    public Person findByLogin(String login){
        return repository.findByLogin(login).orElseThrow(() ->
                new ResponseStatusException(HttpStatus.NOT_FOUND, "Нет пользователя с login " + login));
    }

    @EventListener(ContextRefreshedEvent.class)
    private void createStartData(){

        Person person1 = new Person();
        person1.setLogin("admin");
        person1.setPassword("admin");
        person1.setRole("admin");

        Person person2 = new Person();
        person2.setLogin("user");
        person2.setPassword("user");
        person2.setRole("user");

        createPerson(person1);
        createPerson(person2);
    }
}
