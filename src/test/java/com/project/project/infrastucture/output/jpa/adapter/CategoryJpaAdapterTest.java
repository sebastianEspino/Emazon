package com.project.project.infrastucture.output.jpa.adapter;

import com.project.project.domain.model.PageResponse;
import com.project.project.domain.model.category;
import com.project.project.infrastucture.output.jpa.entity.categoryEntity;
import com.project.project.infrastucture.output.jpa.mapper.CategoryEntityMapper;
import com.project.project.infrastucture.output.jpa.repository.categoryRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.data.domain.*;

import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

class CategoryJpaAdapterTest {

    @Mock
    private categoryRepository iCategoryRepository;

    @Mock
    private CategoryEntityMapper categoryEntityMapper;

    @InjectMocks
    private CategoryJpaAdapter categoryJpaAdapter;

    @BeforeEach
    void setUp(){
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void getParameterizedCategories() {
        Integer page = 0;
        Integer size  = 10;
        String orden = "ASC";
        Sort sort = Sort.by(Sort.Direction.fromString(orden),"name");
        Pageable pageable = PageRequest.of(page,size,sort);
        categoryEntity categoryEntiy = new categoryEntity();
        categoryEntity.setName("Test brand");
        List<categoryEntity> categoryEntityList = Collections.singletonList(categoryEntiy);
        Page<categoryEntity> categoryEntityPage =new PageImpl<>(categoryEntityList,pageable, categoryEntityList.size());
        when(categoryRepository.findAll(pageable)).thenReturn(categoryEntityPage);
        when(CategoryEntityMapper.toCategoryList(categoryEntityList)).thenReturn(List.of(new category(1l,"nike","la mejor")));
        PageResponse<category> response = categoryJpaAdapter.getParameterizedCategories(page,size,orden);

        assertNotNull(response);
        assertEquals(1,response.getTotalElements());
        assertEquals(1,response.getTotalPages());
        assertEquals(1,response.getTotalElements());
        assertEquals("nike" , response.getContent().get(0).getName());

        verify(categoryRepository).findAll(pageable);
    }
}