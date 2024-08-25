package com.project.project.domain.usecase;
import com.project.project.domain.api.categoryServicePort;
import com.project.project.domain.model.category;
import com.project.project.domain.spi.categoryPersistencePort;
import com.project.project.infrastucture.exception.NameCategoryNotBlankException;
import com.project.project.infrastucture.exception.ValidCategoryDescription;

import java.util.List;

public class CategoryUseCase implements categoryServicePort {

    private final categoryPersistencePort categoryPersistencePort;

    public CategoryUseCase(final categoryPersistencePort categoryPersistencePort) {
        this.categoryPersistencePort = categoryPersistencePort;

    }

    private void validCategoryName(String name){
        if(name == null || name.trim().isEmpty() || name.length() > 50){
            throw new NameCategoryNotBlankException();
        }
    }


    private void validCategoryDescription(String description){
        if(description == null || description.trim().isEmpty() || description.length() > 90){
            throw new ValidCategoryDescription();
        }
    }




    @Override
    public void saveCategory(category category) {
        this.categoryPersistencePort.saveCategory(category);
    }

    @Override
    public List<category> getAllCategories() {
        return List.of();
    }

    @Override
    public category getCategory(Long idCategory) {
        return null;
    }

    @Override
    public void updateCategory(category category) {

    }

    @Override
    public void deleteCategory(Long idCategory) {

    }


}
