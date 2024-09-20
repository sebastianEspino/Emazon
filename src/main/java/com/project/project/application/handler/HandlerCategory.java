package com.project.project.application.handler;

import com.project.project.application.dto.categoryDto;
import com.project.project.application.dto.categoryResponse;
import com.project.project.application.mapper.categoryMapper;
import com.project.project.application.mapper.categoryResponseMapper;
import com.project.project.domain.api.categoryServicePort;
import com.project.project.domain.model.PageResponse;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import com.project.project.domain.model.category;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class HandlerCategory implements CategoryHandler {


    private final categoryServicePort categoryServicePort;
    private final categoryMapper categoryMapper;



    @Override
    public void saveCategory(categoryDto categoryDto) {

        category category = categoryMapper.toCategory(categoryDto);

        categoryServicePort.saveCategory(category);
    }


    @Override
    public List<categoryDto> getAllCategories() {
        return List.of();
    }

    @Override
    public PageResponse<categoryResponse> getParameterizedCategories(int page, int size, String orden) {
        PageResponse<category> pageCustom = categoryServicePort.getParameterizedCategories(page, size, orden);
        List<categoryResponse> responseDtos = categoryMapper.toResponseList(pageCustom.getContent());
        return new PageResponse<>(responseDtos,pageCustom.getPage(), pageCustom.getSize(),pageCustom.getTotalElements(),pageCustom.getTotalPages(),pageCustom.getOrden());

    }


}
