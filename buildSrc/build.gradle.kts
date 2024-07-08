plugins {
    `kotlin-dsl`
}

kotlin {
    jvmToolchain(21)
}

repositories {
    gradlePluginPortal()
}

dependencies {
    implementation(libs.gradle.kotlin)
    implementation(libs.gradle.kotlin.spring)
    implementation(libs.gradle.kotlin.jpa)
    implementation(libs.gradle.spring.boot)
    implementation(libs.gradle.lombok)
}
