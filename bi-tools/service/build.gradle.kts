plugins {
    id("java-conventions")
    id("kotlin-conventions")
    id("spring-conventions")
}

dependencies {
    api(project(":bi-tools:core"))
}

dependencies {
    implementation(libs.bundles.spring.boot)
}
