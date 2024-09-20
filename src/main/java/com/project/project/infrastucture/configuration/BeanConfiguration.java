package com.project.project.infrastucture.configuration;

import com.project.project.domain.api.ArticleServicePort;
import com.project.project.domain.api.BrandServicePort;
import com.project.project.domain.api.categoryServicePort;
import com.project.project.domain.spi.ArticlePersistencePort;
import com.project.project.domain.spi.BrandPersistencePort;
import com.project.project.domain.spi.categoryPersistencePort;
import com.project.project.domain.usecase.ArticleUseCase;
import com.project.project.domain.usecase.BrandUseCase;
import com.project.project.domain.usecase.CategoryUseCase;
import com.project.project.infrastucture.output.jpa.adapter.ArticleJpaAdapter;
import com.project.project.infrastucture.output.jpa.adapter.BrandJpaAdapter;
import com.project.project.infrastucture.output.jpa.adapter.CategoryJpaAdapter;
import com.project.project.infrastucture.output.jpa.mapper.ArticleEntityMapper;
import com.project.project.infrastucture.output.jpa.mapper.BrandEntityMapper;
import com.project.project.infrastucture.output.jpa.mapper.CategoryEntityMapper;
import com.project.project.infrastucture.output.jpa.repository.ArticleRepository;
import com.project.project.infrastucture.output.jpa.repository.BrandRepository;
import com.project.project.infrastucture.output.jpa.repository.categoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
@RequiredArgsConstructor
public class BeanConfiguration {

    private final categoryRepository categoryRepository;
    private final CategoryEntityMapper categoryEntityMapper;
    private final ArticleEntityMapper  articleEntityMapper;
    private final ArticleRepository articleRepository;


    @Bean
    public categoryPersistencePort categoryPersistencePort() {
        return new CategoryJpaAdapter(categoryRepository, categoryEntityMapper);
    }

    @Bean
    public categoryServicePort categoryServicePort() {
        return new CategoryUseCase(categoryPersistencePort());
    }

    @Bean
    public ArticlePersistencePort articlePersistencePort() {
        return new ArticleJpaAdapter(articleEntityMapper,articleRepository);
    }

    @Bean
    public ArticleServicePort articleServicePort() {
        return new ArticleUseCase(articlePersistencePort());
    }




}
