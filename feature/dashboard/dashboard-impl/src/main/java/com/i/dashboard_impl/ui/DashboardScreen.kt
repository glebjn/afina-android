package com.i.dashboard_impl.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.i.core.feature.compose.DevicePreviews
import com.i.dashboard_impl.R

@Composable
fun DashboardRoute() {
    DashboardScreen()
}

@Composable
internal fun DashboardScreen() {
    Column {
        DashboardDescription()
    }
}

@Composable
internal fun DashboardDescription() {
    Column {
        Text(
            text = stringResource(id = R.string.onboarding_dashboard_title),
            textAlign = TextAlign.Center,
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 24.dp),
            style = MaterialTheme.typography.titleMedium
        )
        Text(
            text = stringResource(id = R.string.onboarding_dashboard_subtitle),
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 8.dp, start = 16.dp, end = 16.dp),
            textAlign = TextAlign.Center,
            style = MaterialTheme.typography.bodyMedium
        )
    }
}

@DevicePreviews
@Composable
fun DashboardScreenPreview() {
    MaterialTheme {
        DashboardDescription()
    }
}