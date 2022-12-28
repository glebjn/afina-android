package com.i.auth_impl.data.api

import com.i.auth_impl.data.request.LoginRequest
import com.i.auth_impl.data.response.LoginResponse
import retrofit2.http.Body
import retrofit2.http.POST

interface AuthService {

    @POST("/signUp")
    suspend fun login(@Body request: LoginRequest): LoginResponse
}