package ru.LearnUp.springbootbookstore.dao.entity;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "book_storage")
@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class BookStorage {

    @Id
    private long id;

    @Column
    private int amount;

    @OneToOne
    @JoinColumn
    private Book book;

}
