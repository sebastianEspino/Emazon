package com.project.project.application.mapper;

import com.project.project.application.dto.ArticleRequestDto;
import com.project.project.domain.model.Article;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;


@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface ArticleMapper {
    Article<Long,Long> toArticle(ArticleRequestDto articleRequestDto);
}
