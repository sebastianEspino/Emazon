package com.project.project.infrastucture.output.jpa.mapper;

import com.project.project.domain.model.category;
import com.project.project.infrastucture.output.jpa.entity.categoryEntity;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface CategoryEntityMapper {

    categoryEntity toCategoryEntity(category category);


    List<category> toCategoryList(List<categoryEntity> categoryList);

}
