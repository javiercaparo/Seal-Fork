plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.android.library) apply false
    alias(libs.plugins.kotlin.android) apply false
    alias(libs.plugins.kotlin.serialization) apply false
    alias(libs.plugins.ksp) apply false
    alias(libs.plugins.compose.compiler) apply false
    alias(libs.plugins.room) apply false
    id("org.sonarqube") version "6.0.1.5171" // Replace with latest scanner version
}

buildscript {
    repositories {
        mavenCentral()
        google()
    }
}

tasks.register("clean", Delete::class) {
    delete(rootProject.layout.buildDirectory)
}

sonar {
  properties {
    property("sonar.projectKey", "Seal-Fork")
    property("sonar.organization", "javiercaparo") 
    property("sonar.host.url", "https://sonarcloud.io")
  }
}
