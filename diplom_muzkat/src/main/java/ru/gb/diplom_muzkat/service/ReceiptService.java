package ru.gb.diplom_muzkat.service;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;
import ru.gb.diplom_muzkat.entity.CalculateSumFromReceipt;
import ru.gb.diplom_muzkat.entity.Receipt;
import ru.gb.diplom_muzkat.repository.JpaReceiptRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ReceiptService {
    private final CalculateSumFromReceipt calculateSumFromReceipt;
    private final JpaReceiptRepository jpaReceiptRepository;
    public static final String NOT_FOUND_MESSAGE = "Не удалось найти маршрут с id=";


    public Receipt findById(Long id) {
        Receipt receipt = jpaReceiptRepository.findById(id).orElse(null);
        if (receipt == null){
            throwNotFoundExceptionById(id);
        }
        return receipt;
    }

    private void throwNotFoundExceptionById(long id) {
        throw new ResponseStatusException(HttpStatus.NOT_FOUND, NOT_FOUND_MESSAGE + id);
    }

    public void addNewReceipt(String timeOfStart, String timeOfFinish) {
        jpaReceiptRepository.save(new Receipt(timeOfStart, timeOfFinish));
    }

    public void deleteById(Long id) {
        jpaReceiptRepository.deleteById(id);
    }

    public List<Receipt> getAll() {
        return jpaReceiptRepository.findAll();
    }

    public List<Receipt> findReceipt() {
        return jpaReceiptRepository.findAll();
    }
}
