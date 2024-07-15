rootProject.name = "VKKT"

includeBuild("convention-plugins")

val projects = listOf("utils", "objects", "responses", "methods", "longpoll")

for (p in projects) {
    val path = ":$p"
    include(path)
    project(path).name = "vkkt-$p"
}

pluginManagement {
    repositories {
        google()
        gradlePluginPortal()
        mavenCentral()
    }
}

dependencyResolutionManagement {
    repositories {
        google()
        mavenCentral()
    }
}
