package ru.gb.issue_service;

import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;
import com.netflix.discovery.shared.Application;
import org.springframework.cloud.client.loadbalancer.reactive.ReactorLoadBalancerExchangeFilterFunction;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.List;
import java.util.Random;
import java.util.UUID;

@Component
public class BookProvider {

    private final WebClient webClient;
//    private final EurekaClient eurekaClient;

    public BookProvider(EurekaClient eurekaClient, ReactorLoadBalancerExchangeFilterFunction loadBalancerExchangeFilterFunction) {
        webClient = WebClient.builder()
                .filter(loadBalancerExchangeFilterFunction)
                .build();
//        this.eurekaClient = eurekaClient;
    }

    public UUID getRandomBookId() {
        Book randomBook = webClient.get()
//                .uri("http://localhost:8180/book/random")
//                .uri(getBookServiceIp() + "/book/random")
                .uri("http://book-service/book/random")
                .retrieve()
                .bodyToMono(Book.class)
                .block();
//        System.out.println(randomBook);

        return randomBook.getId();
    }

//    private String getBookServiceIp(){
//        Application application = eurekaClient.getApplication("BOOK-SERVICE");
//        List<InstanceInfo> instanceInfos = application.getInstances();
//
//        Random random = new Random();
//        InstanceInfo randomInstance = instanceInfos.get(random.nextInt(instanceInfos.size()));
//        return "http://" + randomInstance.getIPAddr() + ":" + randomInstance.getPort();
//    }
}
