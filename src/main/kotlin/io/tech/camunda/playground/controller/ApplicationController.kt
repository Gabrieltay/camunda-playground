package io.tech.camunda.playground.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api")
class ApplicationController {
    @GetMapping("/")
    fun hello(): String {
        return "hello world"
    }
}