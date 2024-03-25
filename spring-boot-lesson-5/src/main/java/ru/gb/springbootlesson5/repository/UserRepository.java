package ru.gb.springbootlesson5.repository;

import org.springframework.data.repository.CrudRepository;
import ru.gb.springbootlesson5.model.User;

public interface UserRepository extends CrudRepository<User, Long> {

}
