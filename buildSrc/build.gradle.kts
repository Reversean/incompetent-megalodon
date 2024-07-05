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
    implementation(libs.kotlin.gradle)
//    implementation(libs.spring.boot.gradle)
}
