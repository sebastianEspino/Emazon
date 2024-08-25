package com.project.project.application.handler;

import com.project.project.application.dto.categoryDto;
import com.project.project.application.dto.categoryResponse;

import java.util.List;

public interface CategoryHandler {

    void saveCategory(categoryDto category);

    List<categoryDto> getAllCategories();



}
