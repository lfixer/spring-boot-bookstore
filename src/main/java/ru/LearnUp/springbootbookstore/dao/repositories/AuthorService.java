package ru.LearnUp.springbootbookstore.dao.repositories;

import org.springframework.stereotype.Service;
import ru.LearnUp.springbootbookstore.dao.entity.Author;

import java.util.List;

@Service
public class AuthorService {
    private final AuthorRepository repository;

    public AuthorService(AuthorRepository repository) {
        this.repository = repository;
    }

    public Author createAuthor(Author author) {
        return repository.save(author);
    }

    public List<Author> getAuthors() {
        return repository.findAll();
    }

    public Author getAuthorById(Long id) {
        return repository.getById(id);
    }
}
