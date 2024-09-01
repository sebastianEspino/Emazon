package com.project.project.infrastucture.output.jpa.mapper;

import com.project.project.domain.model.Brand;
import com.project.project.infrastucture.output.jpa.entity.BrandEntity;
import com.project.project.infrastucture.output.jpa.entity.categoryEntity;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface BrandEntityMapper {

     BrandEntity toBrandEntity(Brand brand);
     List<Brand> toBrandList(List<BrandEntity> brandList);


}
