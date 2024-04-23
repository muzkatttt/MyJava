package com.gb;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ConditionalOnProperty(value = "aspect.timer.enabled", havingValue = "true")
public class TimerAspectAutoConfiguration {
    @Bean
    TimerAspect timerAspect() {
        return new TimerAspect();
    }
}
