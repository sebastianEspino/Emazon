package com.project.project.application.handler;

import com.project.project.application.dto.categoryDto;
import com.project.project.application.dto.categoryResponse;
import com.project.project.domain.model.PageResponse;

import java.util.List;

public interface CategoryHandler {

    void saveCategory(categoryDto category);

    List<categoryDto> getAllCategories();

    PageResponse<categoryResponse> getParameterizedCategories(int page, int size, String orden);



}
