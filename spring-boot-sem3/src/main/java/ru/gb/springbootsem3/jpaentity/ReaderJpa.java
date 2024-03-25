package ru.gb.springbootsem3.jpaentity;

import jakarta.persistence.*;
import lombok.Data;


@Entity
@Data
@Table(name = "readers")
public class ReaderJpa {

    public ReaderJpa(String name) {
        this.name = name;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "name")
    private final String name;

}
