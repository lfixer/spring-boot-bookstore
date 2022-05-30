package ru.LearnUp.springbootbookstore.dao.services;

import org.springframework.stereotype.Service;
import ru.LearnUp.springbootbookstore.dao.entity.Author;
import ru.LearnUp.springbootbookstore.dao.entity.Customer;
import ru.LearnUp.springbootbookstore.dao.repositories.CustomerRepository;

import java.util.List;

@Service
public class CustomerService {
    private final CustomerRepository repository;

    public CustomerService(CustomerRepository repository) {
        this.repository = repository;
    }

    public Customer createCustomer(Customer customer) {
        return repository.save(customer);
    }

    public List<Customer> getCustomers() {
        return repository.findAll();
    }

    public Customer getCustomerById(Long id) {
        return repository.getById(id);
    }
}
