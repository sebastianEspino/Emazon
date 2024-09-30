package com.project.project.infrastucture.output.jpa.adapter;

import com.project.project.domain.model.Brand;
import com.project.project.domain.spi.BrandPersistencePort;
import com.project.project.infrastucture.output.jpa.entity.BrandEntity;
import com.project.project.infrastucture.output.jpa.entity.categoryEntity;
import com.project.project.infrastucture.output.jpa.mapper.BrandEntityMapper;
import com.project.project.infrastucture.output.jpa.repository.BrandRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;

@RequiredArgsConstructor
public class BrandJpaAdapter implements BrandPersistencePort {

    private final BrandRepository brandRepository;
    private final BrandEntityMapper brandEntityMapper;

    @Override
    public void saveBrand(Brand brand) {

        BrandEntity brandEntity = brandEntityMapper.toBrandEntity(brand);
        brandRepository.save(brandEntity);

    }

    @Override
    public List<Brand> getParameterizedCategories(int page, int size, String orden) {
        Sort sort = Sort.by(Sort.Direction.fromString(orden),"name");
        Pageable pageable = PageRequest.of(page,size,sort);
        Page<BrandEntity> BrandyEntiyPage = brandRepository.findAll(pageable);
        return brandEntityMapper.toBrandList(BrandyEntiyPage.getContent());
    }
}
