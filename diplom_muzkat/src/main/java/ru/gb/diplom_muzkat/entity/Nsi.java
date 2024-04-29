package ru.gb.diplom_muzkat.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;


@Entity
@Data // создает геттеры
@Table(name = "nsi")
public class Nsi {

    Double longShoulder151 = 0.3; // доплата за длинное плечо

    Double heavyWeight152 = 0.1; // доплата за проведение поездов повышенного веса и длины

    Double nightHours023 = 0.4; // ночные часы

    Double harmfulWorkingConditions057 = 0.04; // доплата за вредные условия труда

    Double qualification025 = 0.05; // надбавка за класс квалификации

    Double hourlyRate004 = 300.00; // часовая тарифная ставка

    Double bonus011 = 0.3; // базовый размер премии
}
