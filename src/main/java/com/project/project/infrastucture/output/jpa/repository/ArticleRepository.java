package com.project.project.infrastucture.output.jpa.repository;

import com.project.project.domain.model.Article;
import com.project.project.infrastucture.output.jpa.entity.ArticleEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ArticleRepository extends JpaRepository<ArticleEntity,Long> {
    Optional<Article> findByName(String name);
}
