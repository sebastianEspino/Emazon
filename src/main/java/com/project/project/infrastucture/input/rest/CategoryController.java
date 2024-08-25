package com.project.project.infrastucture.input.rest;

import com.project.project.application.dto.categoryDto;
import com.project.project.application.dto.categoryResponse;
import com.project.project.application.handler.CategoryHandler;
import com.project.project.application.mapper.categoryMapper;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;

import java.util.List;


@RestController
@RequestMapping("/category")
@RequiredArgsConstructor
public class CategoryController {

    private final CategoryHandler categoryHandler;

    @PostMapping("/")
    public ResponseEntity<Void> saveCategory(@Valid @RequestBody categoryDto categoryRequest) {
        categoryHandler.saveCategory(categoryRequest);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    // hu-1


}


