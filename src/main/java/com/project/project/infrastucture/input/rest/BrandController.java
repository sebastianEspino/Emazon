package com.project.project.infrastucture.input.rest;

import com.project.project.application.dto.BrandRequestDto;
import com.project.project.application.dto.BrandResponseDto;
import com.project.project.application.dto.categoryDto;
import com.project.project.application.dto.categoryResponse;
import com.project.project.application.handler.BrandHandler;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @GetMapping("/")
    public  ResponseEntity<List<BrandResponseDto>> getParameterizedCategories(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size,
            @RequestParam(defaultValue = "asc") String orden
    ){
        return ResponseEntity.ok(brandHandler.getParameterizedCategories(page, size, orden));

    }

}
