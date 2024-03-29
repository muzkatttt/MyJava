package ru.gb.springbootsem3.crudrepository;

import org.springframework.data.repository.CrudRepository;
import ru.gb.springbootsem3.jpaentity.IssueJpa;

public interface IssueCrudRepository extends CrudRepository<IssueJpa, Long> {
}
