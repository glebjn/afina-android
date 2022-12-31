package com.i.dashboard_impl.di

import com.i.dashboard_api.IDashboardFeatureRegister
import com.i.dashboard_impl.feature_register.DashboardFeatureRegister
import com.i.dashboard_impl.ui.DashboardViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.module.Module
import org.koin.dsl.module

val dashboardDi = module {
    ui()
}

internal fun Module.ui() {
    factory<IDashboardFeatureRegister> { DashboardFeatureRegister() }
    viewModel { DashboardViewModel() }
}