package ru.gb.springbootlesson10.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.gb.springbootlesson10.app.data.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
