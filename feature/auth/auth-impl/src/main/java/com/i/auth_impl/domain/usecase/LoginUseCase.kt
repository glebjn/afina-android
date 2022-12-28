package com.i.auth_impl.domain.usecase

import com.i.auth.ILoginUseCase
import com.i.auth_impl.data.repository.IAuthRepository

internal class LoginUseCase(
    private val authRepository: IAuthRepository
) : ILoginUseCase {

    override suspend fun invoke(email: String, password: String) {
        authRepository.loginUser(email, password)
    }
}