package ru.LearnUp.springbootbookstore.dao.repositories;

import org.springframework.stereotype.Service;
import ru.LearnUp.springbootbookstore.dao.entity.Book;
import ru.LearnUp.springbootbookstore.dao.entity.Purchase;

import java.util.List;

@Service
public class PurchaseService {
    private final PurchaseRepository repository;

    public PurchaseService(PurchaseRepository repository) {
        this.repository = repository;
    }

    public Purchase createPurchase(Purchase purchase) {
        return repository.save(purchase);
    }

    public List<Purchase> getPurchases() {
        return repository.findAll();
    }

    public Purchase getPurchaseById(Long id) {
        return repository.getById(id);
    }
}
