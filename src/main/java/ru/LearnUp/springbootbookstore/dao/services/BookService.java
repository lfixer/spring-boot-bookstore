package ru.LearnUp.springbootbookstore.dao.services;

import org.springframework.stereotype.Service;
import ru.LearnUp.springbootbookstore.dao.entity.Author;
import ru.LearnUp.springbootbookstore.dao.entity.Book;
import ru.LearnUp.springbootbookstore.dao.repositories.BookRepository;

import java.util.List;

@Service
public class BookService {
    private final BookRepository repository;

    public BookService(BookRepository repository) {
        this.repository = repository;
    }

    public Book createBook(Book book) {
        return repository.save(book);
    }

    public List<Book> getBooks() {
        return repository.findAll();
    }

    public Book getBookById(Long id) {
        return repository.getById(id);
    }
}
