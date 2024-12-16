package org.ibn_al_rabi.backend

object UrlConstants {
    private const val API_V1_ROUTE = "/api/v1"


    const val ACTIVE_API_ROUTE = API_V1_ROUTE
    const val USER_API_ROUTE = "$ACTIVE_API_ROUTE/user"
    const val LOGIN_WITH_PROVIDER_ROUTE = "$ACTIVE_API_ROUTE/loginWithProvider"
}