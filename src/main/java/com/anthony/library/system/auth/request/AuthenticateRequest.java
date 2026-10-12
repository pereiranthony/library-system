package com.anthony.library.system.auth.request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.*;

public record AuthenticateRequest (
        @NotBlank
        @Email
        String email,
        @NotBlank
        @Size(min = 8)
        String password){}
