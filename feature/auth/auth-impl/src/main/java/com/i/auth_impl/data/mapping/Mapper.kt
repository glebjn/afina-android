package com.i.auth_impl.data.mapping

import com.i.auth_impl.data.response.LoginResponse
import com.i.auth_impl.domain.model.AuthModel

val loginResponseMapper: (LoginResponse) -> AuthModel = { response ->
    AuthModel(response.token)
}