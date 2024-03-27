package ru.gb.springbootsem3.jparepository;

import org.springframework.data.repository.CrudRepository;
import ru.gb.springbootsem3.entity.Issue;

public interface IssueCrudRepository extends CrudRepository<Issue, Long> {
}
