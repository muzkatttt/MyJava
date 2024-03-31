package ru.gb.myshopbookv2.mapper;

import org.springframework.stereotype.Component;
import ru.gb.myshopbookv2.dto.BookDto;
import ru.gb.myshopbookv2.dto.ReaderDto;
import ru.gb.myshopbookv2.model.Book;
import ru.gb.myshopbookv2.model.Reader;

import java.util.List;

@Component
public class ReaderMapper {

    public Reader toEntity(ReaderDto readerDto){
        Reader reader = new Reader();
        reader.setName(readerDto.getName());
        return reader;
    }

    public ReaderDto toDto(Reader reader){
        ReaderDto readerDto = new ReaderDto();
        readerDto.setId(reader.getId());
        readerDto.setName(reader.getName());

        return readerDto;
    }

    public List<ReaderDto> listEntityToListDto(List<Reader> list){
        return list.stream().map(this::toDto).toList();
    }

    public List<Reader> listDtoToListEntity(List<ReaderDto> list){
        return list.stream().map(this::toEntity).toList();
    }
}
