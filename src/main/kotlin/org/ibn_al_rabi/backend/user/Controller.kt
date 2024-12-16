package org.ibn_al_rabi.backend.user

import org.ibn_al_rabi.backend.UrlConstants
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController("UserController")
@RequestMapping(UrlConstants.USER_API_ROUTE)
class Controller {


    @GetMapping("")
    fun findAll(): String {
        return "Hello, Users!"
    }

    @GetMapping("/{id}")
    fun findById(@PathVariable id: String): String {
        return "Hello, User with id = $id!"
    }

    @PostMapping("")
    fun create(): String {
        return "Hello, User created!"
    }

    @PutMapping("/{id}")
    fun update(@PathVariable id: String): String {
        return "Hello, User with id = $id updated!"
    }

    @DeleteMapping("/{id}")
    fun delete(@PathVariable id: String): String {
        return "Hello, User with id = $id deleted!"
    }
}