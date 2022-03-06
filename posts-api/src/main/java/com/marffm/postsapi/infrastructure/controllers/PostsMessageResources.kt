package com.marffm.postsapi.infrastructure.controllers

import org.springframework.messaging.handler.annotation.MessageMapping
import org.springframework.stereotype.Controller

@Controller
@MessageMapping("api.posts")
class PostsMessageResources {

    @MessageMapping("collect")
    fun collectPosts(): String {
        return "Hello Posts"
    }
}