package com.i.dashboard_api

import com.i.core.feature.IFeatureRegister

interface IDashboardFeatureRegister : IFeatureRegister {

    fun dashboardRoute(): String
}