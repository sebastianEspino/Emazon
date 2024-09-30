package com.project.project.infrastucture.output.jpa.mapper;

import com.project.project.domain.model.Article;

import com.project.project.infrastucture.output.jpa.entity.ArticleEntity;
import com.project.project.infrastucture.output.jpa.entity.BrandEntity;
import com.project.project.infrastucture.output.jpa.entity.categoryEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface ArticleEntityMapper {
    @Mapping(target = "categories",ignore = true)
    @Mapping(target = "brand",ignore = true)
    Article<categoryEntity, BrandEntity> toArticle(Article<Long,Long> article);
    ArticleEntity toArticleEntity(Article<categoryEntity, BrandEntity> article);
}
