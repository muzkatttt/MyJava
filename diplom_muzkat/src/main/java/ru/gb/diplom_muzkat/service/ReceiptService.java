package ru.gb.diplom_muzkat.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.gb.diplom_muzkat.entity.Receipt;
import ru.gb.diplom_muzkat.repository.CalculateSumFromReceipt;

@Service
@RequiredArgsConstructor
public class ReceiptService {
    private final CalculateSumFromReceipt repository;

//    public Receipt findById(Long id){
//        return repository.findById(id).orElse(null);
//    }
}
//public class ReaderService {
//    private final ReaderRepository readerRepository;
//    private final IssueRepository issueRepository;
//    public Reader findById(Long id){
//        return readerRepository.findById(id).orElse(null);
//    }
//    public void addNewReader(String name){
//        readerRepository.save(new Reader(name));
//    }
//    public void deleteById(Long id){
//        readerRepository.deleteById(id);
//    }
//    public List<Reader> getAll(){
//        return  readerRepository.findAll();
//    }
//    public Reader findByName(String name){
//        return readerRepository.findByName(name);
//    }
//
//    public List<Issue> findIssue(Long id) {
//        return issueRepository.findIssueAllByIdReader(id);
//    }
//}
