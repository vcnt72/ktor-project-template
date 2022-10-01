package com.lazydev.app

import io.ktor.server.engine.*
import io.ktor.server.netty.*
import com.lazydev.app.plugins.*

fun main() {
    embeddedServer(Netty, port = 8080, host = "0.0.0.0") {
        configureSerialization()
        configureMonitoring()
        configureHTTP()
        configureRouting()
    }.start(wait = true)
}
