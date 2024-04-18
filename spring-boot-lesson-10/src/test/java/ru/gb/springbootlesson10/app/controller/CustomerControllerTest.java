package ru.gb.springbootlesson10.app.controller;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.web.reactive.server.WebTestClient;
import ru.gb.springbootlesson10.app.data.Customer;
import ru.gb.springbootlesson10.app.dto.CustomerDto;
import ru.gb.springbootlesson10.app.repository.CustomerRepository;

import java.util.List;
import java.util.Objects;

import static org.junit.jupiter.api.Assertions.*;

//@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
//@AutoConfigureWebTestClient
//@ActiveProfiles("test")
class CustomerControllerTest extends JUnitSpringBootBase{

    @Autowired
    WebTestClient webTestClient;
    @Autowired
    CustomerRepository customerRepository;
    @Autowired
    JdbcTemplate jdbcTemplate;

    @Test
    void testGetAll() {
        customerRepository.saveAll(List.of(
                        new Customer("first"),
                        new Customer("second")
                )
        );

        List<Customer> customers = customerRepository.findAll();

        List<CustomerDto> responseBody = webTestClient.get()
                .uri("customer")
                .exchange()
                .expectStatus().isOk()
                .expectBody(new ParameterizedTypeReference<List<CustomerDto>>() {
                })
                .returnResult()
                .getResponseBody();

        Assertions.assertEquals(customers.size(), responseBody.size());
        for (CustomerDto customerDto : responseBody) {
            boolean found = customers.stream()
                    .filter(it -> Objects.equals(customerDto.getId(), it.getId()))
                    .anyMatch(it -> Objects.equals(customerDto.getName(), it.getName()));
            Assertions.assertTrue(found);
        }
    }

    @Test
    void testGetByIdSuccess() {
        Customer savedCustomer = customerRepository.save(new Customer("random"));

        CustomerDto responseBody = webTestClient.get()
                .uri("customer/" + savedCustomer.getId())
                .exchange()
                .expectStatus().isOk()
                .expectBody(CustomerDto.class)
                .returnResult()
                .getResponseBody();

        Assertions.assertNotNull(responseBody);
        Assertions.assertEquals(responseBody.getId(), savedCustomer.getId());
        Assertions.assertEquals(responseBody.getName(), savedCustomer.getName());
    }

    @Test
    void testGetByIdNotFound() {
//        long size = customerRepository.findAll().size();
//        long unexpectedId = size + 1;
        Long maxId = jdbcTemplate.queryForObject("select max(id) from customers", Long.class);
        long unexpectedId;
        if (maxId == null){
            unexpectedId = 1;
        } else {
            unexpectedId = maxId + 1;
        }

        webTestClient.get()
                .uri("customer/" + unexpectedId)
                .exchange()
                .expectStatus().isNotFound();
    }
}