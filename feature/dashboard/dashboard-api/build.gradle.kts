plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
    id("deps")
}

android {
    namespace = "com.i.dashboard_api"
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