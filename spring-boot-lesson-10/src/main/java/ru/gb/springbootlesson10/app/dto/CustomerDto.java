package ru.gb.springbootlesson10.app.dto;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
public class CustomerDto {
    private long id;
    private String name;
}
