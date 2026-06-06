package com.banking.service;

import com.banking.model.Transaction;
import com.banking.repository.TransactionRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class TransactionService {

    private final TransactionRepository repository;

    public TransactionService(TransactionRepository repository) {
        this.repository = repository;
    }

    public Transaction create(Transaction transaction) {
        return repository.save(transaction);
    }

    public List<Transaction> getAll() {
        return repository.findAll();
    }

    public Optional<Transaction> getById(Long id) {
        return repository.findById(id);
    }

    public List<Transaction> getBySender(String sender) {
        return repository.findBySender(sender);
    }

    public Transaction updateStatus(Long id, String status) {
        Transaction t = repository.findById(id)
            .orElseThrow(() -> new RuntimeException("Transaction not found"));
        t.setStatus(status);
        return repository.save(t);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}