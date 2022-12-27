package com.i.afina

import android.app.Application
import com.i.auth_impl.di.authDi
import com.i.dashboard_impl.di.dashboardDi
import org.koin.core.context.startKoin

class AfinaApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            modules(
                authDi,
                dashboardDi
            )
        }
    }
}