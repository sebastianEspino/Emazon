package com.project.project.infrastucture.output.jpa.adapter;

import com.project.project.domain.model.category;
import com.project.project.domain.spi.categoryPersistencePort;
import com.project.project.infrastucture.output.jpa.entity.categoryEntity;
import com.project.project.infrastucture.output.jpa.mapper.CategoryEntityMapper;
import com.project.project.infrastucture.output.jpa.repository.categoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

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
    public List<category> getParameterizedCategories(int page, int size, String orden) {
        Sort sort = Sort.by(Sort.Direction.fromString(orden),"name");
        Pageable pageable = PageRequest.of(page,size,sort);
        Page<categoryEntity> categoryEntiyPage = categoryRepository.findAll(pageable);
        return categoryEntityMapper.toCategoryList(categoryEntiyPage.getContent());
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
