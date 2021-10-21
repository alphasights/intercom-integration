package com.alphasights.app

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class IntercomIntegrationApplication

fun main(args: Array<String>) {
    runApplication<IntercomIntegrationApplication>(*args)
}
