package com.i.auth

interface ILoginUseCase {
    suspend operator fun invoke(email: String, password: String)
}