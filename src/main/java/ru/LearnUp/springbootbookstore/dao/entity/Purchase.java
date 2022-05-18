package ru.LearnUp.springbootbookstore.dao.entity;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "purchase")
@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class Purchase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    @JoinColumn
    private Customer customer;

    @Column
    private float amount;

    @OneToMany(mappedBy = "purchase")
    private List<OrderDetails> details;
}
