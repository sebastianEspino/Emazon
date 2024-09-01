package com.project.project.infrastucture.output.jpa.adapter;

import com.project.project.domain.model.Brand;
import com.project.project.domain.spi.BrandPersistencePort;
import com.project.project.infrastucture.output.jpa.entity.BrandEntity;
import com.project.project.infrastucture.output.jpa.entity.categoryEntity;
import com.project.project.infrastucture.output.jpa.mapper.BrandEntityMapper;
import com.project.project.infrastucture.output.jpa.repository.BrandRepository;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class BrandJpaAdapter implements BrandPersistencePort {

    private final BrandRepository brandRepository;
    private final BrandEntityMapper brandEntityMapper;

    @Override
    public void saveBrand(Brand brand) {

        BrandEntity brandEntity = brandEntityMapper.toBrandEntity(brand);
        brandRepository.save(brandEntity);

    }
}
