package org.foodcom.com.business.core

sealed class DataState<out T> {
    object Idle : DataState<Nothing>()
    data class Loading(val progressBarState: ProgressBarState = ProgressBarState.Idle) : DataState<Nothing>()
    data class Success<out T>(val data: T) : DataState<T>()
    data class Error(val message: String, val error: Throwable? = null) : DataState<Nothing>()
}
