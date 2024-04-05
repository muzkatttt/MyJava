package ru.gb.springhwsem7.service;

import lombok.RequiredArgsConstructor;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;
import ru.gb.springhwsem7.model.UserMyUser;
import ru.gb.springhwsem7.repository.UserMyUserRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserMyUserService {

    private final UserMyUserRepository repository;

    public UserMyUser createUser(UserMyUser user){
        return repository.save(user);
    }

    public List<UserMyUser> getAll(){
        return repository.findAll();
    }

    public UserMyUser findById(long id){
        return repository.findById(id).orElseThrow(() ->
                new ResponseStatusException(HttpStatus.NOT_FOUND, "Нет пользователя с id " + id));
    }

    public UserMyUser findByLogin(String login){
        return repository.findByLogin(login).orElseThrow(() ->
                new ResponseStatusException(HttpStatus.NOT_FOUND, "Нет пользователя с login " + login));
    }

    @EventListener(ContextRefreshedEvent.class)
    private void createStartData(){

        UserMyUser superUser = new UserMyUser();
        superUser.setLogin("admin");
        superUser.setPassword("admin");
        superUser.setRole("admin");

        UserMyUser userMyUser = new UserMyUser();
        userMyUser.setLogin("user");
        userMyUser.setPassword("user");
        userMyUser.setRole("user");

        createUser(superUser);
        createUser(userMyUser);
    }
}
