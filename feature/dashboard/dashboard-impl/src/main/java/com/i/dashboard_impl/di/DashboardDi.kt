package com.i.dashboard_impl.di

import com.i.dashboard_api.IDashboardFeatureRegister
import com.i.dashboard_impl.feature_register.DashboardFeatureRegister
import org.koin.dsl.module

val dashboardDi = module {
    factory<IDashboardFeatureRegister> { DashboardFeatureRegister() }
}