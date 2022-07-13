package io.tech.camunda.playground.delegate

import mu.KotlinLogging
import org.camunda.bpm.engine.delegate.DelegateExecution
import org.camunda.bpm.engine.delegate.JavaDelegate
import org.springframework.stereotype.Component

@Component
class HelloProcessDelegate : JavaDelegate {
    private val logger = KotlinLogging.logger {}

    override fun execute(execution: DelegateExecution) {
        logger.info { "inside hello processing" }
    }
}
