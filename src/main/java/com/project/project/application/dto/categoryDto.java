package com.project.project.application.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class categoryDto {
    private Long id;

    private  String name;
    @NotBlank(message = "There is not description")
    private  String description;

}
