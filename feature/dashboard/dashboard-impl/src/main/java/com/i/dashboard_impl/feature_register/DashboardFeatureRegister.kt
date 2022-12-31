package com.i.dashboard_impl.feature_register

import androidx.compose.ui.Modifier
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import com.i.dashboard_api.IDashboardFeatureRegister
import com.i.dashboard_impl.ui.DashboardRoute
import com.i.dashboard_impl.ui.DashboardScreen

internal class DashboardFeatureRegister : IDashboardFeatureRegister {

    private val baseRoute = "dashboard"

    override fun dashboardRoute(): String {
        return baseRoute
    }

    override fun registerGraph(
        navGraphBuilder: NavGraphBuilder,
        navController: NavHostController,
        modifier: Modifier
    ) {
        navGraphBuilder.composable(baseRoute) {
            DashboardRoute()
        }
    }
}