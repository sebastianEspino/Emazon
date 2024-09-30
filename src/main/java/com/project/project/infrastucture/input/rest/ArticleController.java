package com.project.project.infrastucture.input.rest;

import com.project.project.application.dto.ArticleRequestDto;
import com.project.project.application.dto.BrandRequestDto;
import com.project.project.application.handler.ArticleHandler;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/articles")
@RequiredArgsConstructor
public class ArticleController {

    private final ArticleHandler articleHandler;

    @PostMapping("/")
    public ResponseEntity<Void> saveBrand(@Valid @RequestBody ArticleRequestDto articleRequestDto) {
        articleHandler.saveArticle(articleRequestDto);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }


}
