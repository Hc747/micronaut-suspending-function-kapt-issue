package com.example

import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get

@Controller("/demo")
class DemoController {

    @Get("/broken")
    suspend fun broken(): Any? {
        return "broken :("
    }

    @Get("/works")
    fun works(): Any? {
        return "works :)"
    }
}