package com.project.project.domain.usecase;

import com.project.project.domain.api.BrandServicePort;
import com.project.project.domain.model.Brand;
import com.project.project.domain.spi.BrandPersistencePort;
import com.project.project.infrastucture.exception.NameCategoryNotBlankException;
import com.project.project.infrastucture.exception.ValidCategoryDescription;

public class BrandUseCase implements BrandServicePort {

    private final BrandPersistencePort brandPersistencePort;
    public BrandUseCase(final BrandPersistencePort brandPersistencePort) {
        this.brandPersistencePort = brandPersistencePort;
    }


    @Override
    public void saveBrand(Brand brand) {
        this.brandPersistencePort.saveBrand(brand);
    }
}
