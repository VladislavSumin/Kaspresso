pluginManagement {
    repositories {
        gradlePluginPortal()
        google()
    }
}

dependencyResolutionManagement {
    @Suppress("UnstableApiUsage")
    repositories {
        mavenCentral()
        mavenLocal()
        google()
        maven { url = uri("https://kotlin.bintray.com/kotlinx") }
    }
}

includeBuild("../../")
