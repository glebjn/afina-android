package com.i.auth_impl.data.repository

import com.i.auth_impl.data.request.LoginRequest
import com.i.auth_impl.data.api.AuthService
import com.i.auth_impl.data.mapping.loginResponseMapper
import com.i.auth_impl.domain.model.AuthModel

internal class AuthRepository(
    private val apiService: AuthService
) : IAuthRepository {

    override suspend fun loginUser(email: String, password: String): AuthModel {
        val request = LoginRequest(email, password)
        val response = apiService.login(request)
        return loginResponseMapper(response)
    }
}