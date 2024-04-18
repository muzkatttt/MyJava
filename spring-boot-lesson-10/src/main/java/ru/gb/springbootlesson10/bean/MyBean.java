package ru.gb.springbootlesson10.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.gb.springbootlesson10.junit.Calculator;

//@Component
public class MyBean {

    @Autowired
    Calculator calculator;
}
