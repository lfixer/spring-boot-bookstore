package ru.LearnUp.springbootbookstore.dao.entity;

import javax.persistence.*;
import java.util.List;

@Table(name = "order_details")
@Entity
public class OrderDetails {

    @Id
    private long id;

    @Column
    private int quantity;

    @Column
    private float bookPrice;

    @ManyToOne
    private Purchase purchase;

    @ManyToOne
    private Book book;

}
