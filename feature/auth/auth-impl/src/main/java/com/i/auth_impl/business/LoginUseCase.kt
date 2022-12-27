package com.i.auth_impl.business

import com.i.auth.ILoginUseCase

internal class LoginUseCase(
    private val authRepository: IAuthRepository
) : ILoginUseCase {

    override suspend fun invoke(email: String, password: String) {
        authRepository.loginUser(email, password)
    }
}