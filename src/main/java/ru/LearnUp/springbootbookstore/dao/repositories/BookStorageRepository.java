package ru.LearnUp.springbootbookstore.dao.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import ru.LearnUp.springbootbookstore.dao.entity.Book;
import ru.LearnUp.springbootbookstore.dao.entity.BookStorage;

@Repository
public interface BookStorageRepository extends JpaRepository<BookStorage, Long> {
    @Query(value = "select * from book_storage b where b.book_id = 1?", nativeQuery = true)
    public BookStorage getByBook(Book book);
}
