package org.foodcom.com

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform