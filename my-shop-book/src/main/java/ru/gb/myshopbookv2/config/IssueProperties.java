package ru.gb.myshopbookv2.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Map;

@Data
@ConfigurationProperties(prefix = "spring.application.issue")
@Component
public class IssueProperties {

    private int maxAllowedBooks;
    private Map<String, String> list;
}
