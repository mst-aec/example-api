package com.aec.exampleapi

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ExampleApiApplication

fun main(args: Array<String>) {
    runApplication<ExampleApiApplication>(*args)
}
