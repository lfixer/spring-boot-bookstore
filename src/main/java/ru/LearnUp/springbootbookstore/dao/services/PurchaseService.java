package ru.LearnUp.springbootbookstore.dao.services;

import org.springframework.stereotype.Service;
import org.springframework.transaction.support.TransactionTemplate;
import ru.LearnUp.springbootbookstore.dao.entity.OrderDetails;
import ru.LearnUp.springbootbookstore.dao.entity.Purchase;
import ru.LearnUp.springbootbookstore.dao.repositories.OrderDetailsRepository;
import ru.LearnUp.springbootbookstore.dao.repositories.PurchaseRepository;

import javax.transaction.Transactional;
import java.util.Optional;

@Service
public class PurchaseService {
    /* private final PurchaseRepository repository;

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
    } */

    private final PurchaseRepository repository;

    public PurchaseService(PurchaseRepository repository) {
        this.repository = repository;
    }

    public Purchase createPurchase(Purchase purchase) {
        return repository.save(purchase);
    }

    public Purchase getPurchaseById(Long id) {
        return repository.getById(id);
    }

    @Transactional
    public Purchase update(Purchase purchase) {
        return repository.save(purchase);
    }

}
