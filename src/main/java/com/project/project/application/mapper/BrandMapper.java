package com.project.project.application.mapper;


import com.project.project.application.dto.BrandRequestDto;
import com.project.project.domain.model.Brand;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface BrandMapper {

    Brand toBrand(BrandRequestDto brandRequestDto);


}
