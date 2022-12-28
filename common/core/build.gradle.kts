plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
    id("android-library-config")
    id("deps")
}

android {
    namespace = "com.i.core"
}

dependencies {
    implementation(platform(Deps.android.androidX.compose.composeBom))
    implementation(Deps.kotlin.serialization)

    implementation(Deps.android.androidX.compose.ui)
    implementation(Deps.android.androidX.compose.uiGraphics)
    implementation(Deps.android.androidX.compose.uiToolingPreview)
    implementation(Deps.android.androidX.compose.material)
    implementation(Deps.android.androidX.navigation.compose)

    implementation(Deps.di.koin.core)
    implementation(Deps.di.koin.android)
    implementation(Deps.di.koin.compose)

    implementation(Deps.network.retrofit.core)
    implementation(Deps.network.retrofit.kotlinSerializationConverter)

    implementation(Deps.network.okHttp.bom)
    implementation(Deps.network.okHttp.core)
    implementation(Deps.network.okHttp.logging)

    testImplementation(Deps.testing.junit)
    androidTestImplementation(Deps.android.androidX.test.ext)
}