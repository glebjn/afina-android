plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
    id("deps")
}

android {
    namespace = "com.i.dashboard_impl"
    compileSdk = 33

    defaultConfig {
        minSdk = 24
        targetSdk = 33

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles(file("consumer-rules.pro"))
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
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