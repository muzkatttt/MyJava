package ru.gb;

import lombok.Data;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.UUID;

@Data
public class Issue {
    private UUID id;
    private UUID idBook;
    private UUID idReader;

}
