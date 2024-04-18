package ru.gb.springbootlesson10.bean;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.mock.mockito.SpyBean;
import ru.gb.springbootlesson10.app.controller.JUnitSpringBootBase;

import static org.junit.jupiter.api.Assertions.*;

//@SpringBootTest(classes = {
////        AutoService.class,
////        Auto.class
//        TestConfig.class
//})
class AutoServiceTest extends JUnitSpringBootBase {

    @Autowired
    AutoService autoService;

    @Autowired
//    @Mock
//    @SpyBean
    Auto auto;

    @Test
    void changeWheelsIsOk() {

        Mockito.doNothing().when(auto).changeWheels();
        Assertions.assertTrue(autoService.changeWheels());
    }

    @Test
    void changeWheelsError(){
//        Auto auto1 = new Auto();
//        Auto spy = Mockito.spy(auto1);
//        Mockito.verify(spy).changeWheels();

        Mockito.doThrow(RuntimeException.class).when(auto).changeWheels();
        Assertions.assertFalse(autoService.changeWheels());
    }
}