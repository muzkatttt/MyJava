package ru.gb.springbootlesson5.services;

import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import ru.gb.springbootlesson5.model.User;
import ru.gb.springbootlesson5.repository.JpaUserRepository;

@Service
@RequiredArgsConstructor
public class JpaUserService {
    private final JpaUserRepository repository;

    public User getByName(String name){
        return repository.findByName(name);
    }
}
