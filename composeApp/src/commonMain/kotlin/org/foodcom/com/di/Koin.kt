package org.foodcom.com.di

import kotlinx.serialization.json.Json
import org.foodcom.com.business.core.AppDataStore
import org.foodcom.com.business.core.AppDataStoreManager
import org.foodcom.com.business.datasource.splash.SplashService
import org.foodcom.com.business.datasource.splash.SplashServiceImpl
import org.foodcom.com.business.interactors.splash.AuthInteractor
import org.foodcom.com.common.Context
import org.koin.dsl.module

fun appModule(context: Context) = module {
    single { Json { isLenient = true; ignoreUnknownKeys = true } }
    single<SplashService> { SplashServiceImpl(get()) }
    single<AppDataStore> { AppDataStoreManager(context) }
    single { AuthInteractor(get(), get()) }

}

