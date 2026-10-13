package com.anthony.library.system.book.request;

import jakarta.validation.constraints.*;

public record BookUpdateRequest(
        @Size(max = 100)
        String title,
        @Size(max = 100)
        String author,
        @Size(max = 100)
        String publisher,
        String isbn,
        @Positive
        Integer publicationYear,
        @PositiveOrZero
        Integer quantity) {}
