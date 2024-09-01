package com.project.project.domain.spi;

import com.project.project.domain.model.Brand;

public interface BrandPersistencePort {

    void saveBrand(Brand brand);
}
