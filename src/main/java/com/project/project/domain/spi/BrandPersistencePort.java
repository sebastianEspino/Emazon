package com.project.project.domain.spi;

import com.project.project.domain.model.Brand;
import com.project.project.domain.model.category;

import java.util.List;

public interface BrandPersistencePort {

    void saveBrand(Brand brand);
    List<Brand> getParameterizedCategories(int page, int size, String orden);

}
