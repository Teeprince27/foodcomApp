package org.foodcom.com.business.datasource.splash

import com.ecobank.app.business.datasource.network.splash.requests.RegisterRequestDTO
import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.request.headers
import io.ktor.client.request.post
import io.ktor.client.request.setBody
import io.ktor.client.statement.HttpResponse
import io.ktor.http.ContentType
import io.ktor.http.contentType
import io.ktor.http.encodedPath
import io.ktor.http.takeFrom
import org.foodcom.com.business.constants.BASE_URL
import org.foodcom.com.business.datasource.splash.request.LoginRequestDTO

class SplashServiceImpl (
    private val httpClient: HttpClient
) : SplashService {


    override suspend fun login(
        body: LoginRequestDTO
    ): HttpResponse {
        return httpClient.post {
            url {
                headers {
//                    append("test_header", test_variable)
                }
                takeFrom(BASE_URL)
                encodedPath += SplashService.LOGIN
            }
            contentType(ContentType.Application.Json)
            setBody(body)
        }.body()
    }

    override suspend fun register(
        body: RegisterRequestDTO): HttpResponse
    {
//        TODO("Not yet implemented")
        return httpClient.post {
            url {
                headers {
                }
                takeFrom(BASE_URL)
                encodedPath += SplashService.REGISTER
            }
            contentType(ContentType.Application.Json)
            setBody(body)
        }.body()

    }

}