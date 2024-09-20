package com.project.project.application.handler;

import com.project.project.application.dto.ArticleRequestDto;
import com.project.project.application.mapper.ArticleMapper;
import com.project.project.domain.api.ArticleServicePort;
import com.project.project.domain.model.Article;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Transactional
public class HandlerArticle implements  ArticleHandler{
    private final ArticleMapper articleMapper;
    private final ArticleServicePort articleServicePort;


    @Override
    public void saveArticle(ArticleRequestDto articleRequestDto) {
        Article article = articleMapper.toArticle(articleRequestDto);
        articleServicePort.saveArticle(article);
    }
}
