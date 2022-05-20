package ru.LearnUp.springbootbookstore.dao.repositories;

import org.springframework.stereotype.Service;
import ru.LearnUp.springbootbookstore.dao.entity.Customer;
import ru.LearnUp.springbootbookstore.dao.entity.OrderDetails;

import java.util.List;

@Service
public class OrderDetailsService {
    private final OrderDetailsRepository repository;

    public OrderDetailsService(OrderDetailsRepository repository) {
        this.repository = repository;
    }

    public OrderDetails orderDetails(OrderDetails orderDetails) {
        return repository.save(orderDetails);
    }

    public OrderDetails getOrderDetailsById(Long id) {
        return repository.getById(id);
    }
}
