package com.marffm.usersapi.infrastructure.controllers

import org.springframework.messaging.handler.annotation.MessageMapping
import org.springframework.stereotype.Controller
import reactor.core.publisher.Hooks

@Controller
@MessageMapping("api.users")
class UserMessageResource() {

    @MessageMapping("addUser")
    fun addUser(): String {
        Hooks.onErrorDropped {}

        return "Hello World"
    }

}
