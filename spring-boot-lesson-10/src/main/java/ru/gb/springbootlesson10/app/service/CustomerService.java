package ru.gb.springbootlesson10.app.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.gb.springbootlesson10.app.data.Customer;
import ru.gb.springbootlesson10.app.dto.CustomerDto;
import ru.gb.springbootlesson10.app.repository.CustomerRepository;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CustomerService {

    private final CustomerRepository customerRepository;

    public List<CustomerDto> getAll(){
        return customerRepository.findAll().stream()
                .map(this::mapToDto)
                .toList();
    }

    public Optional<CustomerDto> getById(long id){
        return customerRepository.findById(id)
                .map(this::mapToDto);
    }

    private CustomerDto mapToDto(Customer customer){
        CustomerDto customerDto = new CustomerDto();
        customerDto.setId(customer.getId());
        customerDto.setName(customer.getName());
        return customerDto;
    }
}
