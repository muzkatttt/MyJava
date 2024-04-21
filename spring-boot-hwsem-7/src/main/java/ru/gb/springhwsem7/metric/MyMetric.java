package ru.gb.springhwsem7.metric;

//import io.micrometer.core.instrument.Counter;
//import io.micrometer.core.instrument.MeterRegistry;
//import org.springframework.scheduling.annotation.Scheduled;
//import org.springframework.stereotype.Component;

import java.util.concurrent.atomic.AtomicInteger;

//@Component
//public class MyMetric {
//
//    private final AtomicInteger testBook;
//    private final Counter testCounter;
//
//    public MyMetric(MeterRegistry meterRegistry) {
//        testBook = meterRegistry.gauge("book", new AtomicInteger());
//        testCounter = meterRegistry.counter("my_custom_counter");
//    }
//
//    @Scheduled(fixedDelay = 100, initialDelay = 0) // если требуется вызывать метод приодически
//    public void schedulingTask(){
//        int random = (int) (Math.random()*100);
//        testNumber.set(random);
//
//        testCounter.increment();
//    }
//}
