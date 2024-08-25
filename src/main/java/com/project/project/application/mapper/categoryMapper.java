package com.project.project.application.mapper;

import com.project.project.application.dto.categoryDto;
import com.project.project.domain.model.category;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;


@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface categoryMapper {
      category toCategory(categoryDto categoryRequest);
}
