package me.dio.edu.Sisban.model;

import jakarta.persistence.*;

import java.math.BigDecimal;
@Entity(name="tb_card")
public class Card {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true)
    private int number;
    @Column(name="available_limit",precision = 2, scale = 13)
    private BigDecimal limit;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public BigDecimal getLimit() {
        return limit;
    }

    public void setLimit() {
        this.limit = limit;
    }
}
