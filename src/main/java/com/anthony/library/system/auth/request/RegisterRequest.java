package com.anthony.library.system.auth.request;

import com.anthony.library.system.user.Role;
import jakarta.validation.constraints.*;

public record RegisterRequest(
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
        String password,
        @NotNull
        Role role){}
