plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("deps")
}

android {
    namespace = "com.i.afina"
    compileSdk = 33

    defaultConfig {
        applicationId = "com.i.afina"
        minSdk = 24
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
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
    packagingOptions {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {
    implementation(project(":common:core"))
    implementation(project(":feature:auth:auth-api"))
    implementation(project(":feature:auth:auth-impl"))
    implementation(project(":feature:dashboard:dashboard-api"))
    implementation(project(":feature:dashboard:dashboard-impl"))

    implementation(Deps.android.androidX.core)
    implementation(Deps.android.androidX.lifecycle.runtimeKtx)
    implementation(Deps.android.androidX.compose.activity)

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
    androidTestImplementation(platform(Deps.android.androidX.compose.composeBom))
    androidTestImplementation(Deps.android.androidX.compose.test.uiTestJunit)
    debugImplementation(Deps.android.androidX.compose.uiToolingPreview)
    debugImplementation(Deps.android.androidX.compose.test.uiTestManifest)
}