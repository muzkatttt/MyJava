package ru.gb.diplom_muzkat.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Data // создает геттеры
@NoArgsConstructor // пустой конструктор
@Table(name = "receipt")
@NotNull
public class Receipt {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "number")
    private Long id;

    @Column(name = "hours")
    private Double officeHours; // отработанные часы по маршруту

    @Column(name = "time_of_start")
    @DateTimeFormat
    private String timeOfStart;

    @Column(name = "time_of_finish")
    @DateTimeFormat
    private String timeOfFinish;

    public Receipt(String timeOfStart, String timeOfFinish) {
        this.timeOfStart = timeOfStart;
        this.timeOfFinish = timeOfFinish;
    }
}
