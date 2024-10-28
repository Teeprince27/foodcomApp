package org.foodcom.com.business.core

import org.foodcom.com.common.Context
import org.foodcom.com.common.getData
import org.foodcom.com.common.putData


const val APP_DATASTORE = "org.foodcom.com"

class AppDataStoreManager(val context: Context) : AppDataStore {

    override suspend fun setValue(
        key: String,
        value: String
    ) {
        context.putData(key, value)
    }

    override suspend fun readValue(
        key: String,
    ): String? {
        return context.getData(key)
    }
}