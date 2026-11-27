package com.example.dto;

import jakarta.validation.constraints.Positive;

public record MenuUpdateRequestDto(
        String name,
        @Positive(message = "가격은 0보다 커야 합니다.")
        Integer price
) {
}
