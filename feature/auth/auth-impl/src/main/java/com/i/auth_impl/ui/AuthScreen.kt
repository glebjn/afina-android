package com.i.auth_impl.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import org.koin.androidx.compose.get

@Composable
internal fun AuthScreen(
    authViewModel: AuthViewModel = get(),
    onNavigateDashboard: () -> Unit
) {
    val state: State by authViewModel.state.collectAsState()

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        AuthHeader()
        LoginView(
            login = state.login,
            password = state.password,
            onLoginChanged = {
                authViewModel.dispatch(Events.LoginTextChanged(it))
            },
            onPasswordChanged = {
                authViewModel.dispatch(Events.PasswordTextChanged(it))
            }
        )
        AuthFooter {
            onNavigateDashboard()
            //authViewModel.dispatch(Events.LoginButtonClicked)
        }
    }
}

@Composable
internal fun AuthHeader() {
    Text(
        text = "Авторизуйся",
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        textAlign = TextAlign.Center
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
internal fun LoginView(
    login: String,
    password: String,
    onLoginChanged: (String) -> Unit,
    onPasswordChanged: (String) -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        TextField(
            value = login,
            onValueChange = { onLoginChanged(it) },
            modifier = Modifier.fillMaxWidth()
        )
        TextField(
            value = password,
            onValueChange = { onPasswordChanged(it) },
            modifier = Modifier.fillMaxWidth()
        )
    }
}

@Composable
internal fun AuthFooter(
    onAuthButtonClick: () -> Unit
) {
    Button(
        modifier = Modifier
            .padding(16.dp)
            .fillMaxWidth(),
        onClick = onAuthButtonClick
    ) {
        Text(text = "Авторизоваться")
    }
}

@Preview(
    device = Devices.PIXEL_4_XL,
    showSystemUi = true
)
@Composable
internal fun AuthScreenPreview() {
    MaterialTheme {
        AuthScreen {}
    }
}