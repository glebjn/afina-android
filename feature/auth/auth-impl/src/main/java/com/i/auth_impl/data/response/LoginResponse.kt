package com.i.auth_impl.data.response

import kotlinx.serialization.Serializable

@Serializable
data class LoginResponse(
    val token: String
)