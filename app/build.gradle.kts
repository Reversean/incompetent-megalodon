plugins {
    id("java-conventions")
    id("kotlin-conventions")
    id("spring-conventions")
}

dependencies {
    implementation(project(":common:core"))
//    implementation(project(":bi-tools:service"))
}

dependencies {
    implementation(libs.spring.boot.docker.compose)
}

dependencies {
    testImplementation(libs.bundles.kotest)
}
