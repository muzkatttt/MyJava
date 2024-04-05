package ru.gb.springhwsem7.security;

import lombok.RequiredArgsConstructor;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;
import ru.gb.springhwsem7.model.UserMyUser;
import ru.gb.springhwsem7.repository.UserMyUserRepository;

import java.util.List;

@Component
@RequiredArgsConstructor
public class CustomUserDetailService implements UserDetailsService {

    private final UserMyUserRepository repository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        System.out.println("ищем " + username);
        UserMyUser myUser = repository.findByLogin(username).orElseThrow(() ->
                new UsernameNotFoundException("Пользователь " + username + " не найден"));
        System.out.println("нашли " + myUser);
        return new org.springframework.security.core.userdetails.User(myUser.getLogin(), myUser.getPassword(), List.of(
                new SimpleGrantedAuthority(myUser.getRole())
        ));
    }
}
