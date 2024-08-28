package com.project.project.domain.usecase;

import com.project.project.domain.model.category;
import com.project.project.domain.spi.categoryPersistencePort;
import com.project.project.infrastucture.exception.NameCategoryNotBlankException;
import com.project.project.infrastucture.exception.ValidCategoryDescription;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.BDDMockito.given;

@ExtendWith(MockitoExtension.class)
class CategoryUseCaseTest {

    @Mock
    private categoryPersistencePort categoryPersistencePort;

    @InjectMocks
    private CategoryUseCase categoryUseCase;




    @Test
    void saveCategory_InvalidCategoryName_ThrowsException() {

        category category = new category(656L,"","celular de 3 pulgadas");



        assertThrows(NameCategoryNotBlankException.class, () -> categoryUseCase.saveCategory(category));
    }

    @Test
    void saveCategory_InvalidCategoryDescription_ThrowsException() {

        category category = new category(1L,"samsung","");

        assertThrows(ValidCategoryDescription.class, () -> categoryUseCase.saveCategory(category));
    }

    @BeforeEach
    void setUp() {
        categoryUseCase = new CategoryUseCase(categoryPersistencePort);
    }
}