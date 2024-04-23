package ru.gb;

import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.cloud.client.loadbalancer.reactive.ReactorLoadBalancerExchangeFilterFunction;

@Component
public class BookProvider {
    private final WebClient webClient;

    public BookProvider(ReactorLoadBalancerExchangeFilterFunction loadBalancerExchangeFilterFunction) {
        webClient = WebClient.builder()
                .filter(loadBalancerExchangeFilterFunction)
                .build();
    }

    public Book getRandomBookId(){
        Book randBook = webClient.get()
                .uri("http://book-service/book/rand")
                .retrieve()
                .bodyToMono(Book.class)
                .block();
        System.out.println(randBook);
        assert randBook != null;
        return randBook;
    }

}
