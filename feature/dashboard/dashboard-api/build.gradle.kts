plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
    id("android-library-config")
    id("deps")
}

android {
    namespace = "com.i.dashboard_api"
}

dependencies {
    implementation(
            project(":common:core")
    )
    implementation(Deps.android.androidX.core)
    implementation(Deps.android.androidX.lifecycle.runtimeKtx)
    implementation(Deps.android.androidX.compose.activity)
    testImplementation(Deps.testing.junit)
    androidTestImplementation(Deps.android.androidX.test.ext)
}