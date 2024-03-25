package ru.gb.springbootlesson5.services;

import lombok.RequiredArgsConstructor;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import ru.gb.springbootlesson5.model.User;
import ru.gb.springbootlesson5.repository.UserRepository;

import java.util.List;
import java.util.stream.StreamSupport;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository repository;

    @EventListener(ContextRefreshedEvent.class)
    public void onCreateDatabase(){
        repository.save(new User("Костя", 100));
        repository.save(new User("Василий", 10));
        repository.save(new User("Кирилл", 12));
        repository.save(new User("Виталий", 15));
    }

    public List<User> getUsers(){
        Iterable<User> iterable = repository.findAll();
        return StreamSupport.stream(iterable.spliterator(), false).toList();
    }

    @Transactional(propagation = Propagation.MANDATORY)
    public void updateUser(long id, String newName, int newAge){
        User user = repository.findById(id).orElseThrow();

        user.setName(newName);
        repository.save(user);

        fail();

        user.setAge(newAge);
        repository.save(user);
    }

    private void fail(){
        throw new RuntimeException("Проблема с записью");
    }
}
