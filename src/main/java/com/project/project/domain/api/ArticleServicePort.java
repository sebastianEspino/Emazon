package com.project.project.domain.api;

import com.project.project.domain.model.Article;

public interface ArticleServicePort {
    void saveArticle(Article<Long,Long> article);
}
