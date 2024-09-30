package com.project.project.application.mapper;

import com.project.project.application.dto.categoryDto;
import com.project.project.application.dto.categoryResponse;
import com.project.project.domain.model.category;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;


@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE)

public interface categoryMapper {
      category toCategory(categoryDto categoryRequest);

    default List<categoryResponse> toResponseList(List<category> categoryList){
        return categoryList.stream()
                .map(category -> {
                    categoryResponse categoryResponseDto = new categoryResponse();
                    categoryResponseDto.setId(category.getId());
                    categoryResponseDto.setName(category.getName());
                    categoryResponseDto.setDescription(category.getDescription());
                    return categoryResponseDto;
                }).toList();
    }
}
