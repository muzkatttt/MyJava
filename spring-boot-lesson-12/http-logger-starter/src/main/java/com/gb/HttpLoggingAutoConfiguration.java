package com.gb;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(LoggingProperties.class)
public class HttpLoggingAutoConfiguration {

    @Bean
//    @ConditionalOnProperty(value = "http.logging.enabled", havingValue = "true")
    LoggerFilter loggerFilter(LoggingProperties loggingProperties){
        return new LoggerFilter(loggingProperties);
    }

    @Bean
//    @ConditionalOnMissingBean(value = LoggerFilter.class)
    StubLoggerFilter stubLoggerFilter(){
        return new StubLoggerFilter();
    }
}
