package com.i.core.feature

import androidx.compose.ui.Modifier
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController

fun NavGraphBuilder.register(
    IFeatureRegister: IFeatureRegister,
    navController: NavHostController,
    modifier: Modifier = Modifier
) {
    IFeatureRegister.registerGraph(
        navGraphBuilder = this,
        navController = navController,
        modifier = modifier
    )
}