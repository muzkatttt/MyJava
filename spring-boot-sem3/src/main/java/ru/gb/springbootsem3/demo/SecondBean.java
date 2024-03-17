package demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
public class SecondBean {
    @Autowired
    ApplicationEventPublisher publisher;

    public SecondBean() {
    }

    public void postConstruct() {
        this.publisher.publishEvent(new MyEvent(this));
    }
}
