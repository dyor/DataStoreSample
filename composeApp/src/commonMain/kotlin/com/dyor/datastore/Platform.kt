package com.dyor.datastore

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform