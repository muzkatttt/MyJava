package repository;

import java.util.ArrayList;
import java.util.List;

import entity.Reader;
import org.springframework.stereotype.Repository;

@Repository
public class ReaderRepository {
    private List<Reader> list = new ArrayList();

    public ReaderRepository() {
        this.list.add(new Reader("Костя"));
        this.list.add(new Reader("Василий"));
        this.list.add(new Reader("Семен"));
    }

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


