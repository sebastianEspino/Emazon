package com.project.project.domain.api;

import com.project.project.domain.model.Brand;


import java.util.List;

public interface BrandServicePort {

    void saveBrand(Brand brand);
    List<Brand> getParameterizedCategories(int page, int size, String orden);


}
