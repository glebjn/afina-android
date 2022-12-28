package com.i.auth_impl.data.repository

import com.i.auth_impl.domain.model.AuthModel

interface IAuthRepository {
    suspend fun loginUser(email: String, password: String): AuthModel
}