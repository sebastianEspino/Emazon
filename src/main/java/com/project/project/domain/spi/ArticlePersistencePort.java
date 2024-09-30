package com.project.project.domain.spi;

import com.project.project.domain.model.Article;

public interface ArticlePersistencePort {
    void saveArticle(Article<Long,Long> article);
}
