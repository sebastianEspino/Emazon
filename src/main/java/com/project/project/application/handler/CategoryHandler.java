package com.project.project.application.handler;

import com.project.project.application.dto.categoryDto;


import java.util.List;

public interface CategoryHandler {

    void saveCategory(categoryDto category);

    List<categoryDto> getAllCategories();

    List<categoryDto> getParameterizedCategories(int page, int size,String orden);




}
