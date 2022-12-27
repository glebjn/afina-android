pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "afina"

include(":app")
includeModulesFrom("common")
includeModulesFrom("feature")

/**
 * Функция, которая заменяет ручную "регистрацию" модуля.
 * Вызовет include для всех найденных модулей внутри директории
 */
fun includeModulesFrom(sourcesDirName: String) {
    val sourcesDir = file(sourcesDirName)
    // Проходимся по всем поддиректориям до указанной глубины. Ее можно будет увеличить, если структура усложнится
    sourcesDir.walkTopDown().maxDepth(3).forEach { subDir ->
        if (isModule(subDir)) {
            // Получаем полное название модуля через его относительный путь и замену слешей на дветочие
            val moduleName = subDir.relativeTo(sourcesDir.parentFile).toString()
                .replace(File.separatorChar, ':')
            include(moduleName)
        }
    }
}

/**
 * Функция, определяющая, является ли директория модулем в контексте gradle
 */
fun isModule(dir: File): Boolean {
    // Просто проверяем наличие build.gradle файла в директории
    return File(dir, "build.gradle").exists() || File(dir, "build.gradle.kts").exists()
}
