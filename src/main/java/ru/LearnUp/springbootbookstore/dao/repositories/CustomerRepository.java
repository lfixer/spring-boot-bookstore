package ru.LearnUp.springbootbookstore.dao.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.LearnUp.springbootbookstore.dao.entity.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
