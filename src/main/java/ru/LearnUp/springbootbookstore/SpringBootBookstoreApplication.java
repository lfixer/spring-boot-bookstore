package ru.LearnUp.springbootbookstore;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.ConfigurableApplicationContext;

import org.springframework.data.redis.repository.configuration.EnableRedisRepositories;
import ru.LearnUp.springbootbookstore.dao.services.AuthorService;
import ru.LearnUp.springbootbookstore.dao.repositories.BookRepository;
import ru.LearnUp.springbootbookstore.dao.services.BookService;


@SpringBootApplication
@EnableCaching
@EnableRedisRepositories
public class SpringBootBookstoreApplication {
	private static final
	Logger log = LoggerFactory.getLogger(SpringBootBookstoreApplication.class);
	public static void main(String[] args) {

		ConfigurableApplicationContext context = SpringApplication.run(SpringBootBookstoreApplication.class, args);

		BookService bookService = context.getBean(BookService.class);
		AuthorService authorService = context.getBean(AuthorService.class);
		BookRepository repository = context.getBean(BookRepository.class);

		log.info("Books: {}", repository.findByAuthor(1L));

	}

}
