package ru.LearnUp.springbootbookstore.dao.entity;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.data.redis.core.RedisHash;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "book")
@Getter
@Setter
@RequiredArgsConstructor
@RedisHash
public class Book implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private String title;

    @ManyToOne
    @JoinColumn
    private Author author;

    @Column
    private int year;

    @Column
    private int pages;

    @Column
    private float price;

    @OneToMany(mappedBy = "book", fetch = FetchType.EAGER)
    private List<OrderDetails> orderDetails;

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author=" + author +
                ", year=" + year +
                ", pages=" + pages +
                ", price=" + price +
                '}';
    }
}
