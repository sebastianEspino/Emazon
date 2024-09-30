package com.project.project.infrastucture.output.jpa.adapter;

import com.project.project.domain.model.Article;
import com.project.project.domain.spi.ArticlePersistencePort;
import com.project.project.infrastucture.exception.NoExistCategories;
import com.project.project.infrastucture.output.jpa.entity.ArticleEntity;
import com.project.project.infrastucture.output.jpa.entity.BrandEntity;
import com.project.project.infrastucture.output.jpa.entity.categoryEntity;
import com.project.project.infrastucture.output.jpa.mapper.ArticleEntityMapper;
import com.project.project.infrastucture.output.jpa.repository.ArticleRepository;
import com.project.project.infrastucture.output.jpa.repository.BrandRepository;
import com.project.project.infrastucture.output.jpa.repository.categoryRepository;
import lombok.RequiredArgsConstructor;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

@RequiredArgsConstructor
public class ArticleJpaAdapter implements ArticlePersistencePort {

    private final ArticleEntityMapper articleEntityMapper;
    private final ArticleRepository articleRepository;
    private final BrandRepository brandRepository;
    private final categoryRepository categoryRepository;



    @Override
    public void saveArticle(Article<Long,Long> article) {
        BrandEntity brand = brandRepository.findById(article.getBrand())
                .orElseThrow();

        Set<categoryEntity> categoryEntities = article.getCategories().stream()
                .map(categoryRepository::findById)
                .filter(Optional::isPresent)
                .map(Optional::get)
                .collect(Collectors.toSet());

        if (categoryEntities.size() != article.getCategories().size()) {
            throw new NoExistCategories("No existe categorias");
        }

        Article<categoryEntity, BrandEntity> categoryEntityArticle = articleEntityMapper.toArticle(article);
        
        articleRepository.save(articleEntityMapper.toArticleEntity(categoryEntityArticle));


    }
}
