package org.ibn_al_rabi.backend.loginWithProvider.dto

import jakarta.validation.constraints.Email
import jakarta.validation.constraints.NotEmpty
import jakarta.validation.constraints.NotNull

//todo: add validation for provider
data class RequestDTO(
    @NotNull
    @NotEmpty
    val name: String,

    @NotNull
    @Email
    val email: String,

    @NotNull
    @NotEmpty
    val provider: String,
)
