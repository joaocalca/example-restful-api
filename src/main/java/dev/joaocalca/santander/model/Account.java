package dev.joaocalca.santander.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Entity(name = "tb_account")
@Getter
@Setter
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String number;

    private String agency;

    @Column(nullable = false, scale = 2, precision = 13)
    private BigDecimal balance;

    @Column(name = "additional_limit", nullable = false, scale = 2, precision = 13)
    private BigDecimal limit;
}
