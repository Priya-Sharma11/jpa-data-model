package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
public class Security {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long securityID;

    @ManyToOne
    @JoinColumn(name = "portfolioID")
    private Portfolio portfolio;

    @Column
    private String name;
    @Column
    private String category;
    @Column
    private LocalDate purchaseDate;
    @Column
    private BigDecimal purchasePrice;
    @Column
    private int quantity;

    public Security() {
    }

    public Security(Long securityID, Portfolio portfolio, String name, String category, LocalDate purchaseDate, BigDecimal purchasePrice, int quantity) {
        this.securityID = securityID;
        this.portfolio = portfolio;
        this.name = name;
        this.category = category;
        this.purchaseDate = purchaseDate;
        this.purchasePrice = purchasePrice;
        this.quantity = quantity;
    }

    public Long getSecurityID() {
        return securityID;
    }

    public void setSecurityID(Long securityID) {
        this.securityID = securityID;
    }

    public Portfolio getPortfolio() {
        return portfolio;
    }

    public void setPortfolio(Portfolio portfolio) {
        this.portfolio = portfolio;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public LocalDate getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(LocalDate purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public BigDecimal getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(BigDecimal purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
