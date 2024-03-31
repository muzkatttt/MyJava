package ru.gb.springbootlesson3.repository;

import org.springframework.stereotype.Repository;
import ru.gb.springbootlesson3.entity.Issue;
import ru.gb.springbootlesson3.entity.Reader;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ReaderRepository {
    private List<Reader> list = new ArrayList<>();

    public ReaderRepository() {
        list.add(new Reader("Костя"));
        list.add(new Reader("Василий"));
        list.add(new Reader("Семен"));
    }

    public Reader findById(long id){
        return list.stream().filter(e -> e.getId() == id)
                .findFirst()
                .orElse(null);
    }
}
