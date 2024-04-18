package ru.gb.springbootlesson10.app.controller;

import org.springframework.boot.test.autoconfigure.web.reactive.AutoConfigureWebTestClient;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import ru.gb.springbootlesson10.bean.TestConfig;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT, classes = TestConfig.class)
@AutoConfigureWebTestClient
@ActiveProfiles("test")
public abstract class JUnitSpringBootBase {
}
