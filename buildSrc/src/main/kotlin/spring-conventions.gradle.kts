import org.springframework.boot.gradle.plugin.SpringBootPlugin

plugins {
    `java-library`

    id("org.springframework.boot")
}

springBoot {
    buildInfo()
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(platform(SpringBootPlugin.BOM_COORDINATES))
    implementation("org.springframework.boot:spring-boot-starter")
}

dependencies {
    testImplementation("org.springframework.boot:spring-boot-starter-test")
}

pluginManager.withPlugin("kotlin-conventions") {
    logger.lifecycle("Applying Spring configuration for Kotlin")

    plugins {
        kotlin("plugin.spring")
        kotlin("plugin.jpa")
    }

    dependencies {
        implementation(kotlin("reflect"))
        implementation("com.fasterxml.jackson.module:jackson-module-kotlin")

        withLibrary("mockito-kotlin") {
            testImplementation(it)
        }
    }
}
