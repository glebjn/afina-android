package com.i.auth_impl.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.i.auth.ILoginUseCase
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch

internal class AuthViewModel(
    val loginUseCase: ILoginUseCase
) : ViewModel() {

    val state = MutableStateFlow(State())

   fun dispatch(event: Events) {
       viewModelScope.launch {
           when(event) {
               is Events.LoginTextChanged -> {
                   state.update { it.copy(login = event.login) }
               }
               is Events.PasswordTextChanged -> {
                   state.update { it.copy(password = event.password) }
               }
               Events.LoginButtonClicked -> {
                   loginUseCase(state.value.login, state.value.password)
               }
           }
       }
   }
}

sealed interface Events {
    data class LoginTextChanged(val login: String) : Events
    data class PasswordTextChanged(val password: String) : Events
    object LoginButtonClicked : Events
}

data class State(
    val login: String = "",
    val password: String = ""
)