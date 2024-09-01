package com.project.project.application.handler;

import com.project.project.application.dto.BrandRequestDto;
import com.project.project.application.dto.BrandResponseDto;

import java.util.List;

public interface BrandHandler {
    void saveBrand(BrandRequestDto brandRequestDto);
    List<BrandResponseDto> getParameterizedCategories(int page, int size, String orden);

}
