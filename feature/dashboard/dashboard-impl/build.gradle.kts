plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
    id("android-library-config")
    id("deps")
}

android {
    namespace = "com.i.dashboard_impl"
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.3.2"
    }
}

dependencies {
    implementation(project(":common:core"))
    implementation(project(":feature:dashboard:dashboard-api"))

    implementation(platform(Deps.android.androidX.compose.composeBom))
    implementation(Deps.android.androidX.compose.ui)
    implementation(Deps.android.androidX.compose.uiGraphics)
    implementation(Deps.android.androidX.compose.uiToolingPreview)
    implementation(Deps.android.androidX.compose.material)
    implementation(Deps.android.androidX.navigation.compose)

    implementation(Deps.android.androidX.lifecycle.viewmModelKtx)
    implementation(Deps.android.androidX.lifecycle.viewModelCompose)

    implementation(Deps.di.koin.core)
    implementation(Deps.di.koin.android)
    implementation(Deps.di.koin.compose)

    testImplementation(Deps.testing.junit)
    androidTestImplementation(Deps.android.androidX.test.ext)
}