package com.project.project.application.handler;

import com.project.project.application.dto.BrandRequestDto;
import com.project.project.application.dto.BrandResponseDto;
import com.project.project.application.mapper.BrandMapper;
import com.project.project.domain.api.BrandServicePort;
import com.project.project.domain.model.Brand;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class HandlerBrand implements BrandHandler {

    private final BrandMapper brandMapper;
    private final BrandServicePort brandServicePort;

    @Override
    public void saveBrand(BrandRequestDto brandRequestDto) {

        Brand brand = brandMapper.toBrand(brandRequestDto);
        brandServicePort.saveBrand(brand);
    }

    @Override
    public List<BrandResponseDto> getParameterizedCategories(int page, int size, String orden) {
        return brandMapper.toResponseList(brandServicePort.getParameterizedCategories(page, size, orden));
    }
}
