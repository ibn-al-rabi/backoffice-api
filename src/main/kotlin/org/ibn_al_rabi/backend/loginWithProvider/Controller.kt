package org.ibn_al_rabi.backend.loginWithProvider

import jakarta.validation.Valid
import org.ibn_al_rabi.backend.UrlConstants
import org.ibn_al_rabi.backend.loginWithProvider.dto.RequestDTO
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

//TODO: either use ResponseEntity or look into elide
//TODO: add testing as well
@RestController("LoginWithProvider")
@RequestMapping(UrlConstants.LOGIN_WITH_PROVIDER_ROUTE)
class Controller {
    @PostMapping("")
    fun post(@Valid @RequestBody requestDTO: RequestDTO): String {
        println("AbdAllah: got the request: $requestDTO")

        return "Hello, will create a user in a mint"
    }
}