package com.i.afina.auth

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun AuthScreen() {
    Column(
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        AuthHeader()
        LoginView()
        AuthFooter()
    }
}

@Composable
fun AuthHeader() {
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
fun LoginView() {
    Column(
        modifier = Modifier.fillMaxWidth()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        TextField(
            value = "",
            onValueChange = {},
            modifier = Modifier.fillMaxWidth()
        )
        TextField(
            value = "",
            onValueChange = {},
            modifier = Modifier.fillMaxWidth()
        )
    }
}

@Composable
fun AuthFooter() {
    Button(
        modifier = Modifier
            .padding(16.dp)
            .fillMaxWidth(),
        onClick = {}
    ) {
        Text(text = "Авторизоваться")
    }
}

@Preview(
    device = Devices.PIXEL_4_XL,
    showSystemUi = true
)
@Composable
fun AuthScreenPreview() {
    MaterialTheme {
        AuthScreen()
    }
}