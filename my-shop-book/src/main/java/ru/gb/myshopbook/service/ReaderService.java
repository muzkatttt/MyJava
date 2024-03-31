package ru.gb.myshopbook.service;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;
import ru.gb.myshopbook.model.Reader;
import ru.gb.myshopbook.repository.ReaderRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ReaderService {
    public static final String NOT_FOUND_MESSAGE = "Не удалось найти читателя с id=";

    private final ReaderRepository readerRepository;

    public Reader findById(long id){
        Reader reader = readerRepository.findById(id).orElse(null);
        if (reader == null){
            throwNotFoundExceptionById(id);
        }
        return reader;
    }

    public void deleteById(long id){
        checkExistsById(id);
        readerRepository.deleteById(id);
    }

    public Reader createReader(Reader reader){
        reader.setId(null);
        return readerRepository.save(reader);
    }

    public Reader updateReader(long id, Reader reader) {
        checkExistsById(id);
        reader.setId(id);
        return readerRepository.save(reader);
    }

    public List<Reader> findAll() {
        return readerRepository.findAll();
    }

    private void checkExistsById(long id){
        if (!readerRepository.existsById(id)){
            throwNotFoundExceptionById(id);
        }
    }

    private void throwNotFoundExceptionById(long id){
        throw new ResponseStatusException(HttpStatus.NOT_FOUND, NOT_FOUND_MESSAGE + id);
    }
}
