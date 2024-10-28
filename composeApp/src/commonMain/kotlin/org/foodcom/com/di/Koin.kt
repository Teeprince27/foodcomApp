package com.ecobank.app.di

import kotlinx.serialization.json.Json
import org.foodcom.com.common.Context
import org.koin.dsl.module

fun appModule(context: Context) = module {
    single { Json { isLenient = true; ignoreUnknownKeys = true } }
}

