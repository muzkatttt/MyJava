package ru.gb.issue_service;

import com.netflix.discovery.EurekaClient;
import org.springframework.cloud.client.loadbalancer.reactive.ReactorLoadBalancerExchangeFilterFunction;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.UUID;

@Component
public class BookProvider {
    private final WebClient webClient;

    public BookProvider(EurekaClient eurekaClient, ReactorLoadBalancerExchangeFilterFunction loadBalancerExchangeFilterFunction) {
        webClient = WebClient.builder()
                .filter(loadBalancerExchangeFilterFunction)
                .build();
    }


    public UUID getRandomBookId(){
        Book randBook = webClient.get()
                .uri("http://localhost:8180/book/random")
//                .uri(getBookServiceIp() + "/book/random")
//                .uri("http://book-service/book/random")
                .retrieve()
                .bodyToMono(Book.class)
                .block();
        System.out.println(randBook);
        return randBook.getId();
    }

}
