package com.i.auth_impl.feature_register

import androidx.compose.ui.Modifier
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import com.i.auth.IAuthIFeatureRegister
import com.i.auth_impl.ui.AuthScreen

internal class AuthIFeatureRegister : IAuthIFeatureRegister {

    private val baseRoute = "auth"

    override fun authRoute(): String {
        return "baseRoute"
    }

    override fun registerGraph(
        navGraphBuilder: NavGraphBuilder,
        navController: NavHostController,
        modifier: Modifier
    ) {
        navGraphBuilder.composable(baseRoute) {
            AuthScreen {
                navController.navigate("dashboard")
            }
        }
    }
}