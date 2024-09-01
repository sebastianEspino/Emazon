package com.project.project.infrastucture.input.rest;

import com.project.project.application.dto.BrandRequestDto;
import com.project.project.application.dto.categoryDto;
import com.project.project.application.handler.BrandHandler;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/brand")
@RequiredArgsConstructor
public class BrandController {
    private final BrandHandler brandHandler;

    @PostMapping("/")
    public ResponseEntity<Void> saveBrand(@Valid @RequestBody BrandRequestDto brandRequestDto) {
        brandHandler.saveBrand(brandRequestDto);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

}
