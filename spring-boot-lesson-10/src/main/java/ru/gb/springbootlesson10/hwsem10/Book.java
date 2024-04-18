package ru.gb.springbootlesson10.hwsem10;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@Table(name = "books")
@NoArgsConstructor
public class Book {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private long id;

        @Column(name = "name")
        private String name;

        public Book(String name) {
            this.name = name;
        }
}
