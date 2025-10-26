package com.memoraq.backend

import io.ktor.server.application.Application
import io.ktor.server.netty.EngineMain
import io.ktor.server.response.respondText
import io.ktor.server.routing.Route
import io.ktor.server.routing.get
import io.ktor.server.routing.routing


fun main(args: Array<String>) {
    EngineMain.main(args)
}

fun Application.module() {
    configureRouting()
}

fun Application.customRoutes(){
    routing {
        greeting()
    }
}


fun Application.configureRouting() {
    routing {
        get("/") {
            call.respondText("Hello World!")
        }
    }
}

fun Route.greeting(){
    get("/greet"){
        call.respondText("Greetings from Memoraq backend!")
    }
}

