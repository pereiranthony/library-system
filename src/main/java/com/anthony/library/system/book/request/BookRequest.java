package com.anthony.library.system.book.request;

import jakarta.validation.constraints.*;

public record BookRequest(
        @NotBlank
        @Size(max = 100)
        String title,
        @NotBlank
        @Size(max = 100)
        String author,
        @NotBlank
        @Size(max = 100)
        String publisher,
        @NotBlank
        String isbn,
        @NotNull
        @Positive
        Integer publicationYear,
        @NotNull
        @PositiveOrZero
        Integer quantity) {}
