package ru.LearnUp.springbootbookstore.dao.repositories;

import org.springframework.stereotype.Service;
import ru.LearnUp.springbootbookstore.dao.entity.Book;
import ru.LearnUp.springbootbookstore.dao.entity.BookStorage;

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
}
