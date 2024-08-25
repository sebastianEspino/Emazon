package com.project.project.infrastucture.configuration;

import com.project.project.domain.api.categoryServicePort;
import com.project.project.domain.spi.categoryPersistencePort;
import com.project.project.domain.usecase.CategoryUseCase;
import com.project.project.infrastucture.output.jpa.adapter.CategoryJpaAdapter;
import com.project.project.infrastucture.output.jpa.mapper.CategoryEntityMapper;
import com.project.project.infrastucture.output.jpa.repository.categoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
@RequiredArgsConstructor
public class BeanConfiguration {

    private final categoryRepository categoryRepository;
    private final CategoryEntityMapper categoryEntityMapper;

    @Bean
    public categoryPersistencePort categoryPersistencePort() {
        return new CategoryJpaAdapter(categoryRepository, categoryEntityMapper);
    }

    @Bean
    public categoryServicePort categoryServicePort() {
        return new CategoryUseCase(categoryPersistencePort());
    }



}
