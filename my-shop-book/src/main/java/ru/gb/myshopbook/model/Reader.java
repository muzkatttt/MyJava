package ru.gb.myshopbook.model;

import jakarta.persistence.*;
import lombok.Data;

@Table(name = "readers")
@Entity
@Data
public class Reader {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name")
    private String name;
}
