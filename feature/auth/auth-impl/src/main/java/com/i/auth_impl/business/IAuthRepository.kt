package com.i.auth_impl.business

interface IAuthRepository {
    suspend fun loginUser(email: String, password: String)
}