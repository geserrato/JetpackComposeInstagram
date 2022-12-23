package com.geserrato.jetpackcomposeinstagram.login.domain

import com.geserrato.jetpackcomposeinstagram.login.data.LoginRepository

class LoginUseCase {
    private val repository = LoginRepository()

    suspend operator fun invoke(user: String, password: String): Boolean {
        return repository.doLogin(user, password)
    }
}