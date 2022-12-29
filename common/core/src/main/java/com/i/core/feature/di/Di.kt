package com.i.core.feature.di

import com.jakewharton.retrofit2.converter.kotlinx.serialization.asConverterFactory
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.json.Json
import okhttp3.MediaType.Companion.toMediaType
import org.koin.dsl.module
import retrofit2.Retrofit

@OptIn(ExperimentalSerializationApi::class)
val coreDi = module {
    single<Retrofit> {
        val contentType = "application/json".toMediaType()
        Retrofit.Builder()
            .baseUrl("https://127.0.0.1.8080/")
            .addConverterFactory(Json.asConverterFactory(contentType))
            .build()
    }
}