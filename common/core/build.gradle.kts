plugins {
    id("java-conventions")
    id("spring-conventions")
}

dependencies {
    implementation(libs.spring.boot.web)
    implementation(libs.spring.boot.jpa)

    runtimeOnly(libs.postgresql)
}
