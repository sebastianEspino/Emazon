package com.project.project.infrastucture.output.jpa.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "article")

public class ArticleEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Size(max = 50)
    private String name;
    @Size(max = 120)
    @Column(nullable = false)
    private String description;
    private int quantity;
    private BigDecimal price;
    @ManyToMany
    private Set<categoryEntity> categories;
    private Long brand;


}
