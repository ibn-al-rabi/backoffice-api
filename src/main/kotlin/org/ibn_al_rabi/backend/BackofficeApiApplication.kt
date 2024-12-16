package org.ibn_al_rabi.backend

import PortalProperties
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.boot.runApplication

@SpringBootApplication
@EnableConfigurationProperties(PortalProperties::class)
class BackofficeApiApplication

fun main(args: Array<String>) {
	runApplication<BackofficeApiApplication>(*args)
}
