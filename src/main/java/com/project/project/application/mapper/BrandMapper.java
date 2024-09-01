package com.project.project.application.mapper;


import com.project.project.application.dto.BrandRequestDto;
import com.project.project.application.dto.BrandResponseDto;
import com.project.project.application.dto.categoryResponse;
import com.project.project.domain.model.Brand;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface BrandMapper {

    Brand toBrand(BrandRequestDto brandRequestDto);
    default List<BrandResponseDto> toResponseList(List<Brand> brandList){
        return brandList.stream()
                .map(category -> {
                    BrandResponseDto brandResponseDto = new BrandResponseDto();
                    brandResponseDto.setId(category.getId());
                    brandResponseDto.setName(category.getName());
                    brandResponseDto.setDescription(category.getDescription());
                    return brandResponseDto;
                }).toList();
    }

}
