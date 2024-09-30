package com.project.project.application.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Set;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ArticleRequestDto {
    private Long id;
    private  String name;
    private  String description;
    private int quantity;
    private BigDecimal price;
    private Set<Long> categories;
    private Long brand;
}
