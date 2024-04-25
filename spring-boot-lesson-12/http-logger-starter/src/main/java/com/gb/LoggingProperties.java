package com.gb;

import lombok.Data;
import org.slf4j.event.Level;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties(value = "http.logging")
public class LoggingProperties {

    /**
     * Уровень логирования
     */
    private Level logLevel = Level.DEBUG;
}
