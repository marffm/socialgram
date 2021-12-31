package com.marffm.usersapi.infrastructure.controllers

import kotlinx.coroutines.runBlocking
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.messaging.rsocket.RSocketRequester
import org.springframework.messaging.rsocket.connectTcpAndAwait
import org.springframework.messaging.rsocket.retrieveMono

@SpringBootTest
internal class UserMessageResourceTest {

    @Autowired lateinit var rSocketBuilder: RSocketRequester.Builder

    @Test
    fun `testing addUser message`() {
        runBlocking {
            val requester = rSocketBuilder.connectTcpAndAwait("localhost", 8081)

            val result = requester.route("api.users.addUser")
                .retrieveMono<String>()
                .block()

            assertEquals("Hello World", result)
        }


    }

}

