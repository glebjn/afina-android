object Deps {

    val android = Android
    val kotlin = Kotlin
    val di = Di
    val network = Network
    val testing = Testing

    object Kotlin {
        val serialization = "org.jetbrains.kotlinx:kotlinx-serialization-json:${Versions.kotlin.serialization}"
    }

    object Android {
        val androidX = AndroidX

        object AndroidX {
            val navigation = Navigation
            val lifecycle = Lifecycle
            val compose = Compose
            val test = Test

            val core = "androidx.core:core-ktx:${Versions.androidCore}"

            object Navigation {
                val compose = "androidx.navigation:navigation-compose:${Versions.navigation}"
            }

            object Compose {
                val activity = "androidx.activity:activity-compose:${Versions.activityCompose}"
                val composeBom = "androidx.compose:compose-bom:${Versions.composeBom}"
                val ui = "androidx.compose.ui:ui"
                val uiGraphics = "androidx.compose.ui:ui-graphics"
                val uiToolingPreview = "androidx.compose.ui:ui-tooling-preview"
                val material = "androidx.compose.material3:material3"
                val test = Test

                object Test {
                    val uiTestManifest = "androidx.compose.ui:ui-test-manifest"
                    val uiTestJunit = "androidx.compose.ui:ui-test-junit4"
                }
            }

            object Lifecycle {
                val runtimeKtx =
                    "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.lifecycleRuntimeKtx}"
                val viewmModelKtx =
                    "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.lifecycle}"
                val viewModelCompose =
                    "androidx.lifecycle:lifecycle-viewmodel-compose:${Versions.lifecycle}"
            }

            object Test {
                val ext = "androidx.test.ext:junit:${Versions.androidTestExt}"
            }
        }
    }

    object Di {
        val koin = Koin

        object Koin {
            val core = "io.insert-koin:koin-core:${Versions.koinCore}"
            val android = "io.insert-koin:koin-android:${Versions.koinAndroid}"
            val compose = "io.insert-koin:koin-androidx-compose:${Versions.koinCompose}"
        }
    }

    object Network {
        val retrofit = Retrofit
        val okHttp = OkHttp

        object Retrofit {
            val core = "com.squareup.retrofit2:retrofit:${Versions.retrofit}"
            val kotlinSerializationConverter =
                "com.jakewharton.retrofit:retrofit2-kotlinx-serialization-converter:${Versions.kotlin.serializationConverter}"
        }

        object OkHttp {
            val bom = "com.squareup.okhttp3:okhttp-bom:${Versions.okhttp}"
            val core = "com.squareup.okhttp3:okhttp"
            val logging = "com.squareup.okhttp3:logging-interceptor"
        }
    }

    object Testing {
        val junit = "junit:junit:${Versions.jUnit}"
    }
}

object Versions {
    val kotlin = Kotlin
    object Kotlin {
        val core = "1.7.20"
        val serialization = "1.4.1"
        val serializationConverter = "0.8.0"
    }
    val navigation = "2.5.3"
    val lifecycle = "2.5.1"
    val koinCore = "3.3.0"
    val koinAndroid = "3.3.1"
    val koinCompose = "3.4.0"
    val jUnit = "4.13.2"
    val androidTestExt = "1.1.4"
    val composeBom = "2022.10.00"
    val androidCore = "1.9.0"
    val activityCompose = "1.6.1"
    val lifecycleRuntimeKtx = "2.5.1"
    val retrofit = "2.9.0"
    val okhttp = "4.10.0"
}