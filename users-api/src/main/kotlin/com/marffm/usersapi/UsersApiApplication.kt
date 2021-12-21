package com.marffm.usersapi

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
open class UsersApiApplication

fun main(args: Array<String>) {
	runApplication<UsersApiApplication>(*args)
}
