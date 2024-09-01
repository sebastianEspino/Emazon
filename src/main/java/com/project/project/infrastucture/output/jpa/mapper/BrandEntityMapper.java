package com.project.project.infrastucture.output.jpa.mapper;

import com.project.project.domain.model.Brand;
import com.project.project.infrastucture.output.jpa.entity.BrandEntity;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface BrandEntityMapper {

     BrandEntity toBrandEntity(Brand brand);

}
