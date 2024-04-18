package ru.gb.springbootlesson10.bean;

import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class AutoService {

    private final Auto auto;

    public boolean changeWheels(){
        try {
            auto.changeWheels();
            return true;
        } catch (Exception e){
            return false;
        }
    }
}
