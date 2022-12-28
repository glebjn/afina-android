object Deps {

    val android = Android
    val di = Di
    val testing = Testing

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
                val runtimeKtx = "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.lifecycleRuntimeKtx}"
                val viewmModelKtx = "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.lifecycle}"
                val viewModelCompose = "androidx.lifecycle:lifecycle-viewmodel-compose:${Versions.lifecycle}"
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

    object Testing {
        val junit = "junit:junit:${Versions.jUnit}"
    }
}
object Versions {
    val kotlin = "1.7.20"
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
}