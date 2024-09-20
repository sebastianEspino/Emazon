package com.project.project.infrastucture.output.jpa.adapter;

import com.project.project.domain.model.Article;
import com.project.project.domain.spi.ArticlePersistencePort;
import com.project.project.infrastucture.output.jpa.entity.ArticleEntity;
import com.project.project.infrastucture.output.jpa.mapper.ArticleEntityMapper;
import com.project.project.infrastucture.output.jpa.repository.ArticleRepository;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class ArticleJpaAdapter implements ArticlePersistencePort {

    private final ArticleEntityMapper  articleEntityMapper;
    private final ArticleRepository articleRepository;

    @Override
    public void saveArticle(Article article) {

        ArticleEntity articleEntity = articleEntityMapper.toArticleEntity(article);
        articleRepository.save(articleEntity);

    }
}
