package io.tech.camunda.playground.controller

import org.camunda.bpm.engine.RuntimeService
import org.joda.time.DateTime
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api")
class ApplicationController {
    @Autowired
    private lateinit var runtimeService: RuntimeService

    private val logger = LoggerFactory.getLogger(this.javaClass)

    @GetMapping("/")
    fun requestHello(): String {
        logger.info("Hello world... start processing")
        runtimeService.startProcessInstanceByKey(
            "hello-process",
            DateTime.now().toString(),
        )
        return "Hello World..."
    }
}