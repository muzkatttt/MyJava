package ru.gb.springbootlesson2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

//@Configuration
public class ApplicationConf {

    @Bean
    UserRepository myUserRepository(){
        return new UserRepository();
    }
}
