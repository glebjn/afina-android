plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
    id("android-library-config")
    id("deps")
    id("org.jetbrains.dokka")
}

android {
    namespace = "com.i.auth"
}

dependencies {
    implementation(
            project(":common:core")
    )
    implementation(platform(Deps.android.androidX.compose.composeBom))
    implementation(Deps.android.androidX.compose.ui)
    implementation(Deps.android.androidX.compose.uiGraphics)
    implementation(Deps.android.androidX.compose.uiToolingPreview)
    implementation(Deps.android.androidX.compose.material)
    implementation(Deps.android.androidX.navigation.compose)
    testImplementation(Deps.testing.junit)
    androidTestImplementation(Deps.android.androidX.test.ext)
}