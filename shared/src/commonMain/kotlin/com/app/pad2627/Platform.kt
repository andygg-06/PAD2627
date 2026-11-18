package com.app.pad2627

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform