package com.project.project.infrastucture.output.jpa.adapter;

import com.project.project.domain.model.category;
import com.project.project.domain.spi.categoryPersistencePort;
import com.project.project.infrastucture.output.jpa.entity.categoryEntity;
import com.project.project.infrastucture.output.jpa.mapper.CategoryEntityMapper;
import com.project.project.infrastucture.output.jpa.repository.categoryRepository;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class CategoryJpaAdapter implements categoryPersistencePort {

    private final categoryRepository categoryRepository;
    private final CategoryEntityMapper categoryEntityMapper;

    @Override
    public void saveCategory(category category) {

        categoryEntity categoryEntity = categoryEntityMapper.toCategoryEntity(category);


        categoryRepository.save(categoryEntity);

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
