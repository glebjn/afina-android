package com.i.auth_impl.di

import com.i.auth.IAuthIFeatureRegister
import com.i.auth.ILoginUseCase
import com.i.auth_impl.data.api.AuthService
import com.i.auth_impl.data.repository.AuthRepository
import com.i.auth_impl.data.repository.IAuthRepository
import com.i.auth_impl.domain.usecase.LoginUseCase
import com.i.auth_impl.feature_register.AuthIFeatureRegister
import com.i.auth_impl.ui.AuthViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.module.Module
import org.koin.dsl.module
import retrofit2.Retrofit

val authDi = module {
    ui()
    domain()
    data()
}

internal fun Module.ui() {
    factory<IAuthIFeatureRegister> { AuthIFeatureRegister() }
    viewModel { AuthViewModel(get()) }
}

internal fun Module.domain() {
    factory<ILoginUseCase> { LoginUseCase(get()) }
}

internal fun Module.data() {
    single {
        val retrofit = get<Retrofit>()
        retrofit.create(AuthService::class.java)
    }
    factory<IAuthRepository> { AuthRepository(get()) }
}