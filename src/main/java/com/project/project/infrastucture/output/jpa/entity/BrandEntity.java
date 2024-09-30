package com.project.project.infrastucture.output.jpa.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.*;

import java.util.Set;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "brand")
@Getter
@Setter
public class BrandEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Size(max = 50)

    private String name;

    @Size(max = 120)
    @Column(nullable = false)

    private String description;

    @OneToMany(mappedBy = "brand")
    private Set<ArticleEntity> article;



}
