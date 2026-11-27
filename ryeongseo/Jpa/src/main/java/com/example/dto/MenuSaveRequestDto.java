package com.example.dto;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

public record MenuSaveRequestDto(
        Long categoryId,
        String name,

        @NotNull(message = "가격은 필수 입력값입니다.")
        @Positive(message = "가격은 0보다 커야 합니다.")
        Integer price
) {
}
