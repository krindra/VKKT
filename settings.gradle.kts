rootProject.name = "VKKT"
include(":utils")
include(":objects")
include(":responses")
include(":methods")
include(":longpoll")
includeBuild("convention-plugins")

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
