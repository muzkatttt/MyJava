package ru.gb.myshopbookv2.service;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;
import ru.gb.myshopbookv2.dto.ReaderDto;
import ru.gb.myshopbookv2.mapper.ReaderMapper;
import ru.gb.myshopbookv2.model.Reader;
import ru.gb.myshopbookv2.repository.ReaderRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ReaderService {
    public static final String NOT_FOUND_MESSAGE = "Не удалось найти читателя с id=";

    private final ReaderRepository readerRepository;
    private final ReaderMapper readerMapper;

    public ReaderDto findById(long id){
        Reader reader = readerRepository.findById(id).orElse(null);
        if (reader == null){
            throwNotFoundExceptionById(id);
        }
        return readerMapper.toDto(reader);
    }

    public void deleteById(long id){
        checkExistsById(id);
        readerRepository.deleteById(id);
    }

    public ReaderDto createReader(ReaderDto readerDto){
        Reader reader = readerMapper.toEntity(readerDto);
        return readerMapper.toDto(readerRepository.save(reader));
    }

    public ReaderDto updateReader(long id, ReaderDto readerDto) {
        checkExistsById(id);
        readerDto.setId(id);
        Reader reader = readerMapper.toEntity(readerDto);
        return readerMapper.toDto(readerRepository.save(reader));
    }

    public List<ReaderDto> findAll() {
        return readerMapper.listEntityToListDto(readerRepository.findAll());
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
