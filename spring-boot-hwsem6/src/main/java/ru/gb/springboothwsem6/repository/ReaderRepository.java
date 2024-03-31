package ru.gb.springboothwsem6.repository;

import java.util.ArrayList;
import java.util.List;

import ru.gb.springboothwsem6.entity.Reader;
import org.springframework.stereotype.Repository;

@Repository
public class ReaderRepository {

    public ReaderRepository() {
        this.list.add(new Reader("Julian"));
        this.list.add(new Reader("John"));
        this.list.add(new Reader("Jam"));
    }

    private List<Reader> list = new ArrayList();

    public Reader findById(long id) {
        return (Reader)this.list.stream().filter((e) -> {
            return e.getId() == id;
        }).findFirst().orElse((Reader) null);
    }

    public List<Reader> getAllReaders() {
        return List.copyOf(list);
    }

    public Reader addReader(Reader reader) {
        list.add(reader);
        return reader;
    }

    public void deleteReader(long id) {
        list.removeIf(reader -> reader.getId() == id);
    }
}


