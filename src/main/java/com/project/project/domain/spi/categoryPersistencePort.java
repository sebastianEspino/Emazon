package com.project.project.domain.spi;
import com.project.project.domain.model.category;


import java.util.List;

public interface categoryPersistencePort {

    void saveCategory(category category);

    List<category> getAllCategories();

    category getCategory(Long idCategory);

    void updateCategory(category category);

    void deleteCategory(Long idCategory);


    List<category> getParameterizedCategories(int page, int size, String orden);






}
