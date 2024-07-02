package me.dio.edu.Sisban.model;

import jakarta.persistence.*;

import java.math.BigDecimal;
@Entity(name="tb_account")
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true)
    private String number;
    private String agencia;
    // 99.999.999.999,99
    @Column(precision = 13, scale = 2)
    private BigDecimal balance;
    @Column(name="additional_limit",precision = 13, scale = 2)
    private BigDecimal limit;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance() {
        this.balance = balance;
    }

    public BigDecimal getLimit() {
        return limit;
    }

    public void setLimit() {
        this.limit = limit;
    }
}
