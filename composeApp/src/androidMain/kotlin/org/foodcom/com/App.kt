package org.foodcom.com

import android.app.Application

class App : Application() {
    companion object {
        private lateinit var instance: Application

        fun getApplicationContext(): Application {
            // Ensure instance is initialized before accessing
            if (!::instance.isInitialized) {
                throw UninitializedPropertyAccessException("Application instance is not initialized")
            }
            return instance
        }
    }

    override fun onCreate() {
        super.onCreate()
        instance = this
    }
}