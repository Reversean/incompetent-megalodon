plugins {
    id("java-conventions")
    id("kotlin-conventions")
    id("spring-conventions")
    id("platform-conventions")
}

dependencies {
    developmentOnly(libs.spring.boot.docker.compose)
}

dependencies {
    implementation(project(":common:core"))
    implementation(project(":bi-tools:service"))

    implementation(libs.platform.accounts.service)
    implementation(libs.platform.i18n.service)
    implementation(libs.platform.notifications.service)
}

dependencies {
    implementation(libs.spring.boot.actuator)

    runtimeOnly(libs.liquibase)
}

dependencies {
    testImplementation(libs.bundles.kotest)
}
