package org.ibn_al_rabi.backend

import PortalProperties
import org.junit.jupiter.api.Test
import org.mockito.Mockito.*
import org.mockito.kotlin.whenever
import org.springframework.web.servlet.config.annotation.CorsRegistration
import org.springframework.web.servlet.config.annotation.CorsRegistry

class WebConfigTest {

    @Test
    fun `addCorsMappings should configure CorsRegistry correctly`() {

        val portalOrigin = "http://localhost:3903"

        val portalProperties = PortalProperties(origin = portalOrigin)
        val webConfig = WebConfig(portalProperties)
        val pathPattern = "/api/**"
        val allowedMethods = arrayOf("GET", "POST", "PUT", "DELETE", "OPTIONS")
        val allowedHeaders = "*"
        val allowCredentials = true


        val corsRegistry = mock<CorsRegistry>()
        val corsRegistration = mock<CorsRegistration>()

        whenever(corsRegistry.addMapping(pathPattern))
            .thenReturn(corsRegistration)
        whenever(corsRegistration.allowedOrigins(portalOrigin))
            .thenReturn(corsRegistration)
        whenever(corsRegistration.allowedMethods(*allowedMethods))
            .thenReturn(corsRegistration)
        whenever(corsRegistration.allowedHeaders(allowedHeaders))
            .thenReturn(corsRegistration)
        whenever(corsRegistration.allowCredentials(allowCredentials))
            .thenReturn(corsRegistration)

        webConfig.addCorsMappings(corsRegistry)

        verify(corsRegistry).addMapping(pathPattern)
        verify(corsRegistration).allowedOrigins(portalOrigin)
        verify(corsRegistration).allowedMethods(*allowedMethods)
        verify(corsRegistration).allowedHeaders(allowedHeaders)
        verify(corsRegistration).allowCredentials(allowCredentials)
    }
}
