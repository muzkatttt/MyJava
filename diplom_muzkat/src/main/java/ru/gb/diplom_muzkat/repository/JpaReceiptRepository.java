package ru.gb.diplom_muzkat.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.gb.diplom_muzkat.entity.CalculateSumFromReceipt;
import ru.gb.diplom_muzkat.entity.Receipt;

import java.util.List;
import java.util.Optional;

public interface JpaReceiptRepository extends JpaRepository<Receipt, Long> {
    Optional<Receipt> findById(Long id);

    public List<Receipt> findAll();

    public CalculateSumFromReceipt calc();
}
