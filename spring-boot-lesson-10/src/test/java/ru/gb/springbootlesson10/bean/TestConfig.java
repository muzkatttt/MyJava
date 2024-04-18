package ru.gb.springbootlesson10.bean;

import org.mockito.Mock;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Bean;

@TestConfiguration
public class TestConfig {

    @MockBean
    private Auto auto;

    @Bean
    AutoService autoService(){
        return new AutoService(auto);
    }
}
