package ru.LearnUp.springbootbookstore.dao.services;

import org.springframework.data.jpa.repository.Lock;
import org.springframework.stereotype.Service;
import ru.LearnUp.springbootbookstore.dao.entity.Book;
import ru.LearnUp.springbootbookstore.dao.entity.BookStorage;
import ru.LearnUp.springbootbookstore.dao.repositories.BookStorageRepository;

import javax.persistence.LockModeType;
import javax.transaction.Transactional;
import java.util.List;

@Service
public class BookStorageService {
    private final BookStorageRepository repository;

    public BookStorageService(BookStorageRepository repository) {
        this.repository = repository;
    }

    public BookStorage createBookStorage(BookStorage bookStorage) {
        return repository.save(bookStorage);
    }

    public List<BookStorage> getBooksStorages() {
        return repository.findAll();
    }

    public BookStorage getBookStorage(Long id) {
        return repository.getById(id);
    }

    public BookStorage getBookStorage(Book book) {
        return repository.getByBook(book);
    }

    @Transactional
    @Lock(value = LockModeType.READ)
    public BookStorage update(BookStorage bookStorage) {
        repository.save(bookStorage);
        return bookStorage;
    }

    @Transactional
    @Lock(value = LockModeType.READ)
    public int buy(Book book, int amount) {
        BookStorage bookStorage = getBookStorage(book);
        if ((bookStorage.getAmount() - amount) >= 0) {
            bookStorage.setAmount(bookStorage.getAmount() - amount);
            update(bookStorage);
        }
        else {
            System.out.println("Книг недостаточно");
        }
        return bookStorage.getAmount();
    }


}
