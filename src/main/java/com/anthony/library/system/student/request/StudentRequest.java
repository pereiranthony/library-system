package com.anthony.library.system.student.request;

import jakarta.validation.constraints.*;

import java.time.LocalDate;

public record StudentRequest(
        @NotBlank
        @Pattern(regexp = "^[0-9]{12}$")
        String enrollmentNumber,
        @NotBlank
        @Size(max = 50)
        String firstName,
        @NotBlank
        @Size(max = 50)
        String lastName,
        @NotBlank
        @Email
        String email,
        @NotBlank
        String courseCode,
        @NotBlank
        String semester,
        @Pattern(regexp = "^[0-9]{11}$|^[0-9]{3}\\.[0-9]{3}\\.[0-9]{3}-[0-9]{2}$")
        String cpf,
        @Pattern(regexp = "^\\+55[0-9]{10}$")
        String phoneNumber,
        @PastOrPresent
        LocalDate dateOfBirth) {}
