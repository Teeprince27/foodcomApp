package org.foodcom.com.business.datasource.splash

import com.ecobank.app.business.datasource.network.splash.requests.RegisterRequestDTO
import io.ktor.client.statement.HttpResponse
import org.foodcom.com.business.datasource.splash.request.LoginRequestDTO

interface
SplashService {

    companion object {
        const val REGISTER = "register"
        const val LOGIN = "login"
    }


    suspend fun login(
        body: LoginRequestDTO
    ): HttpResponse

    suspend fun register(
        body: RegisterRequestDTO
    ): HttpResponse

}