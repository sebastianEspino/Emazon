package com.project.project.application.mapper;


import com.project.project.application.dto.categoryResponse;
import com.project.project.domain.model.category;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring",
        unmappedSourcePolicy = ReportingPolicy.IGNORE,
        unmappedTargetPolicy = ReportingPolicy.IGNORE)

public interface categoryResponseMapper {

    categoryResponse toResponse(category category);

    default List<categoryResponse> toResponseList(List<category> pokemonList) {
        return pokemonList.stream()
                .map(category -> {
                    categoryResponse categoryResponse = new categoryResponse();
                    categoryResponse.setName(category.getName());
                    categoryResponse.setDescription(category.getDescription());

                    return categoryResponse;
                }).toList();

    }

}
