package com.geserrato.jetpackcomposeinstagram.login.data.network

import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject

class LoginService @Inject constructor(
    private val loginClient: LoginClient,
    private val dispatcher: CoroutineDispatcher = Dispatchers.IO
) {
    suspend fun doLogin(user: String, password: String): Boolean {
        return withContext(dispatcher) {
            val response = loginClient.doLogin()
            response.body()?.success ?: false
        }
    }
}