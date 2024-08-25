package com.project.project.application.handler;

import com.project.project.application.dto.categoryDto;
import com.project.project.application.dto.categoryResponse;
import com.project.project.application.mapper.categoryMapper;
import com.project.project.application.mapper.categoryResponseMapper;
import com.project.project.domain.api.categoryServicePort;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import com.project.project.domain.model.category;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class HandlerCategory implements CategoryHandler {


    private final categoryServicePort categoryServicePort;
    private final categoryMapper categoryMapper;
    private final categoryResponseMapper categoryResponseMapper;



    @Override
    public void saveCategory(categoryDto categoryDto) {

        category category = categoryMapper.toCategory(categoryDto);

        categoryServicePort.saveCategory(category);
    }


    @Override
    public List<categoryDto> getAllCategories() {
        return List.of();
    }
}
