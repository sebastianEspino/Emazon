package com.project.project.infrastucture.output.jpa.mapper;

import com.project.project.domain.model.Article;
import com.project.project.infrastucture.output.jpa.entity.ArticleEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface ArticleEntityMapper {
    @Mapping(target = "categories",ignore = true)
    ArticleEntity toArticleEntity(Article article);

}
