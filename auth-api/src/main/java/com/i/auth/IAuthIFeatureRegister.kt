package com.i.auth

import com.i.core.feature.IFeatureRegister

interface IAuthIFeatureRegister : IFeatureRegister {

    fun authRoute(): String
}