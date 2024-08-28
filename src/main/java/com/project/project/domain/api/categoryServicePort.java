package com.project.project.domain.api;
import com.project.project.domain.model.category;
import java.util.List;


public interface categoryServicePort {

    void saveCategory(category category);

    List<category> getAllCategories();

    category getCategory(Long idCategory);

    void updateCategory(category category);

    void deleteCategory(Long idCategory);

    List<category> getParameterizedCategories(int page, int size, String orden);

}