package com.project.project.domain.usecase;

import com.project.project.domain.api.ArticleServicePort;
import com.project.project.domain.model.Article;
import com.project.project.domain.spi.ArticlePersistencePort;
import com.project.project.infrastucture.exception.ValidDescription;
import com.project.project.infrastucture.exception.ValidQuantity;

public class ArticleUseCase implements ArticleServicePort {

    private final ArticlePersistencePort articlePersistencePort;

    public ArticleUseCase(ArticlePersistencePort articlePersistencePort) {
        this.articlePersistencePort = articlePersistencePort;
    }


    @Override
    public void saveArticle(Article<Long,Long> article) {
        if(article.getDescription() == null ||  article.getDescription().trim().isEmpty() || article.getDescription().length() > 90){
            throw new ValidDescription("Mistake in the description");
        }
        if(article.getQuantity() < 1){
            throw new ValidQuantity("Mistake in the quantity");
        }
        articlePersistencePort.saveArticle(article);

    }
}
