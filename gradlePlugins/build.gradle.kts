plugins {
    `kotlin-dsl`
    `java-gradle-plugin`
    `kotlin-dsl-precompiled-script-plugins`
}

gradlePlugin {
    // Создадим пустой плагин, чтобы получить доступ к классам
    plugins.register("deps") {
        id = "deps"
        implementationClass = "com.i.dependencies.DependenciesPlugin"
    }
}

dependencies {
    implementation(kotlin("script-runtime"))
    implementation("com.android.tools.build:gradle:8.0.0-alpha10")
    implementation("org.jetbrains.kotlin:kotlin-stdlib:1.7.22")
    implementation("org.jetbrains.kotlin:kotlin-gradle-plugin:1.7.22")
}
