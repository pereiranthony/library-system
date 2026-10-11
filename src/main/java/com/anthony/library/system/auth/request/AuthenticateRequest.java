package com.anthony.library.system.auth.request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public record AuthenticateRequest (
        @NotBlank
        @Email
        String email,
        @NotBlank
        String password){}
