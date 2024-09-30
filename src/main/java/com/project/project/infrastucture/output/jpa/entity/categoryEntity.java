package com.project.project.infrastucture.output.jpa.entity;

import com.project.project.domain.model.Article;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "category")
public class categoryEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Size(max = 50)
    private String name;

    @Size(max = 90)
    @NotBlank(message = "The description of category is required")
    private String description;


    @ManyToMany(mappedBy = "categories")
    private Set<ArticleEntity> articles = new HashSet<>();



}
