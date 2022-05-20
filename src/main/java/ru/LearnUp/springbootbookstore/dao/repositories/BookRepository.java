package ru.LearnUp.springbootbookstore.dao.repositories;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.redis.core.RedisHash;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import ru.LearnUp.springbootbookstore.dao.entity.Book;

import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {

    @Cacheable(value = "book")
    @Query(value = "select * from book b where b.author_id = :id", nativeQuery = true)
    List<Book> findByAuthor(Long id);
}
