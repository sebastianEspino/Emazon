package com.project.project.infrastucture.output.jpa.entity;


import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.*;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
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
    @JoinTable(
            name = "articulo_categoria",
            joinColumns = @JoinColumn(name = "article_id"),
            inverseJoinColumns = @JoinColumn(name = "category_id")
    )
    private Set<categoryEntity> categories;
    @ManyToOne
    private BrandEntity brand;
}
