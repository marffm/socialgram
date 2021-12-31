package com.marffm.usersapi.infrastructure.repositories

import com.marffm.usersapi.domain.entities.UserEntity
import kotlinx.coroutines.delay
import org.springframework.stereotype.Component

@Component
class UserRepository {

    private val usersList: MutableSet<UserEntity> = mutableSetOf()

    suspend fun saveUser(user: UserEntity) {
        // TODO - Verify user exists and Throw exception

        usersList.add(user)
        delay(100L)
    }
}