package com.aec.exampleapi

import org.springframework.beans.factory.annotation.Value
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.util.*

@RestController
@RequestMapping("/")
class ExampleController {

    @Value("\${api.explanation}")
    private var apiExplanation: String = "Default explanation"

    @Value("\${server.port}")
    private var port: Int = 0

    private val instanceId: String = UUID.randomUUID().toString()

    @GetMapping("def")
    fun getDef(): String {
        return apiExplanation
    }

    @GetMapping("/instance")
    fun getInstanceId(): String {
        return "example api - server port: $port id: $instanceId"
    }

    @GetMapping("/info")
    fun getInfo(): String {
        return "example api response with port: $port"
    }
}