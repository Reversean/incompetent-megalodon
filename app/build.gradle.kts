plugins {
    id("java-conventions")
    id("kotlin-conventions")
    id("spring-conventions")
}

dependencies {
//    implementation(libs.spring.boot.web)
}

dependencies {
    testImplementation(libs.bundles.kotest)
}

tasks.register("pluginList") {
    logger.lifecycle("Applied plugins:")
    plugins.forEach { println(it) }
}
