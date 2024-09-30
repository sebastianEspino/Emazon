package com.project.project.domain.model;

import com.project.project.infrastucture.output.jpa.entity.BrandEntity;
import com.project.project.infrastucture.output.jpa.entity.categoryEntity;

import java.math.BigDecimal;
import java.util.Set;

public class Article<B,C> {

    private Long id;
    private  String name;
    private  String description;
    private int quantity;
    private BigDecimal price;
    private Set<C> categories;
    private B brand;

    public Article(Long id, String name, String description, int quantity, BigDecimal price, Set<C> categories, B brand) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.quantity = quantity;
        this.price = price;
        this.categories = categories;
        this.brand = brand;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Set<C> getCategories() {
        return categories;
    }

    public void setCategories(Set<C> categories) {
        this.categories = categories;
    }

    public B getBrand() {
        return brand;
    }

    public void setBrand(B brand) {
        this.brand = brand;
    }
}
