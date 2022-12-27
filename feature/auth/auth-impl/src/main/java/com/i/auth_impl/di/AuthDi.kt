package com.i.auth_impl.di

import com.i.auth.IAuthIFeatureRegister
import com.i.auth_impl.feature_register.AuthIFeatureRegister
import org.koin.dsl.module

val authDi = module {
    factory<IAuthIFeatureRegister> { AuthIFeatureRegister() }
}