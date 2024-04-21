package ru.gb.springhwsem7.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.gb.springhwsem7.model.UserMyUser;
import java.util.Optional;

public interface UserMyUserRepository extends JpaRepository<UserMyUser, Long> {

    Optional<UserMyUser> findByLogin(String login);
}
