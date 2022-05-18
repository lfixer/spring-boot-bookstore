package ru.LearnUp.springbootbookstore.dao.entity;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "book")
@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class Book {

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

    @OneToMany(mappedBy = "book")
    private List<OrderDetails> orderDetails;

}
