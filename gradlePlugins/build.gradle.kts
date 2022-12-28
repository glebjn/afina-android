plugins {
    `kotlin-dsl`
    `java-gradle-plugin`
}

gradlePlugin {
    // Создадим пустой плагин, чтобы получить доступ к классам
    plugins.register("deps") {
        id = "deps"
        implementationClass = "com.i.dependencies.DependenciesPlugin"
    }
}
