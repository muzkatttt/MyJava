package ru.gb.springbootsem3.jpaentity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;


@Entity
@Data
@Table(name = "readers")
@Component
public class ReaderJpa {

    public ReaderJpa(String name) {
        this.name = name;
    }

    //@Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private long id;

    @Column(name = "name")
    private String name;

}
