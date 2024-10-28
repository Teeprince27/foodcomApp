package org.foodcom.com.business.interactors.splash

import com.ecobank.app.business.datasource.network.splash.requests.RegisterRequestDTO
import io.ktor.client.statement.bodyAsText
import io.ktor.http.HttpStatusCode
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json
import org.foodcom.com.business.constants.AUTHORIZATION_BEARER_TOKEN
import org.foodcom.com.business.constants.DataStoreKeys
import org.foodcom.com.business.core.AppDataStore
import org.foodcom.com.business.core.DataState
import org.foodcom.com.business.datasource.splash.SplashService
import org.foodcom.com.business.datasource.splash.request.LoginRequestDTO
import org.foodcom.com.business.domain.splash.Auth
import org.foodcom.com.business.domain.splash.ErrorMessage


class AuthInteractor(
    private val service: SplashService,
    private val appDataStoreManager: AppDataStore,
) {

    // Configure Json with ignoreUnknownKeys
    val json = Json {
        ignoreUnknownKeys = true // This should ignore unknown keys
        explicitNulls = false
        isLenient = true
        prettyPrint = true
        encodeDefaults = true
        classDiscriminator = "#class"
    }

    fun login(
        body: LoginRequestDTO
    ): Flow<DataState<Auth?>> = flow {
        emit(DataState.Loading())

        try {
            val apiResponse = service.login(body)

            if (apiResponse.status == HttpStatusCode.OK) {
                val responseBody = apiResponse.bodyAsText()
                val authResponse = json.decodeFromString<Auth>(responseBody)

                if (authResponse.statusCode == 200) {

                    appDataStoreManager.setValue(
                        DataStoreKeys.TOKEN,
                        AUTHORIZATION_BEARER_TOKEN + authResponse.data.token
                    )
                    // Serialize the user object to JSON string
                    val userJson = json.encodeToString(authResponse.data.user)
                    // Save the JSON string to appDataStoreManager
                    appDataStoreManager.setValue(
                        DataStoreKeys.USER,
                        userJson
                    )

                    emit(DataState.Success(authResponse))
                } else {
                    val errorMessage = authResponse.message ?: "Unknown error occurred"
                    emit(DataState.Error(errorMessage))
                }
            } else {
                val errorBody = apiResponse.bodyAsText()
                val errorMessage = try {
                    val errorResponse = Json.decodeFromString<ErrorMessage>(errorBody)
                    errorResponse.message
                } catch (e: Exception) {
                    "Unknown error occurred"
                }
                errorMessage?.let { DataState.Error(it) }?.let { emit(it) }
            }
        } catch (e: Exception) {
            emit(DataState.Error(message = "Login failed: ${e.message}"))
            println("error " + e.message)
        } finally {
            // If needed, handle any cleanup
        }
    }

    fun register(
        body: RegisterRequestDTO
    ): Flow<DataState<Auth?>> = flow {
        emit(DataState.Loading())

        try {
            val apiResponse = service.register( body)

            if (apiResponse.status == HttpStatusCode.Created) {
                val responseBody = apiResponse.bodyAsText()
                val authResponse = json.decodeFromString<Auth>(responseBody)

                if (authResponse.statusCode == 201) {
                    appDataStoreManager.setValue(
                        DataStoreKeys.TOKEN,
                        AUTHORIZATION_BEARER_TOKEN + authResponse.data.token
                    )

                    // Serialize the user object to JSON string
                    val userJson = json.encodeToString(authResponse.data.user)
                    // Save the JSON string to appDataStoreManager
                    appDataStoreManager.setValue(
                        DataStoreKeys.USER,
                        userJson
                    )

                    emit(DataState.Success(authResponse))
                } else {
                    val errorMessage = authResponse.message ?: "Unknown error occurred"
                    emit(DataState.Error(errorMessage))
                }
            } else {
                val errorBody = apiResponse.bodyAsText()
                val errorMessage = try {
                    val errorResponse = Json.decodeFromString<ErrorMessage>(errorBody)
                    errorResponse.message
                } catch (e: Exception) {
                    "Unknown error occurred"
                }
                errorMessage?.let { DataState.Error(it) }?.let { emit(it) }
            }
        } catch (e: Exception) {
            emit(DataState.Error(message = "Register failed: ${e.message}"))
            println("error " + e.message)
        } finally {
            // If needed, handle any cleanup
        }
    }


}